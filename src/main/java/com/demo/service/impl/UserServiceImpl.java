package com.demo.service.impl;

import com.demo.mapper.UserMapper;
import com.demo.pojo.Result;
import com.demo.pojo.User;
import com.demo.service.UserService;
import com.demo.util.JedisClientPool;
import com.demo.util.MailUtil;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    public static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Resource
    private UserMapper userMapper;

    @Value("${USER_ACTIVE_CODE_EXPIRE_TIME}")
    private int USER_ACTIVE_CODE_EXPIRE_TIME;

    @Value("${USER_ACTIVE_ID}")
    private String USER_ACTIVE_ID;

    @Resource
    private JedisClientPool jedisClientPool;

    @Resource
    private MailUtil mailUtil;


    public int login(User user) {
        int i = 0;
        try{
            User userResult = userMapper.getUserByUsernameAndPassword(user);
            if(userResult!=null){
                i=1;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return i;
    }

    public User getUserByUsername(String username) {
        User user = null;
        try {
            user = userMapper.getUserByUsername(username);
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public Result insertUser(User user) {

        int auto_id = 0;
        try{
            Date date = new Date();
            user.setRegisterDate(date);
            user.setState(0);
            //拿到用户注册返回的id
            userMapper.insert(user);
            //生成激活码
            String code = UUID.randomUUID().toString().substring(0,5);
            //将激活码存到redis中
            jedisClientPool.set(USER_ACTIVE_ID+":"+user.getId(),code);
            jedisClientPool.expire(USER_ACTIVE_ID+":"+user.getId(),USER_ACTIVE_CODE_EXPIRE_TIME);

            try {
                //发送一封激活邮件
                mailUtil.activeUser(user.getEmail(),user.getId(),code);
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("send user active code error,the userId:%d,the cause:%s",auto_id,e.getCause());
                return new Result(false,"用户注册成功，请联系管理员激活！");
            }

        }catch (Exception e){
            e.printStackTrace();
            logger.error("insert user error,the userId:%d,the cause:%s",auto_id,e.getCause());
            return new Result(false,"系统错误，用户注册未成功！");
        }
        return new Result(true,"用户注册成功，请前往注册邮箱激活账号！");
    }

    /**
     * 完成激活注册用户的逻辑
     * @param id
     * @param code
     * @return
     */
    @Override
    public Result activeUser(int id, String code) {

        //从redis中拿取缓存的激活码
        String realCode = jedisClientPool.get(USER_ACTIVE_ID + ":" + id);
        if(realCode == null){
            //验证码过期
            return new Result(false,"验证码过期！");
        }else if(!code.equals(realCode)){
            return new Result(false,"验证码错误！");
        }else{
            userMapper.updateUserState(id,1);
        }

        return new Result(true,"验证码激活成功！");
    }
}
