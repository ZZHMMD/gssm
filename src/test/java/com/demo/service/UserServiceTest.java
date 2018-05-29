package com.demo.service;

import com.demo.mapper.UserMapper;
import com.demo.pojo.User;
import com.demo.util.JedisClientPool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/*.xml"})
public class UserServiceTest {

   @Resource
   private UserService userService;

   @Resource
   private UserMapper userMapper;

    @Test
    public void login() {
    }

    @Test
    public void getUserByUsername() {
    }

    @Test
    public void insertUser() {
        User user = new User();

        user.setUsername("xiaohong");
        user.setPassword("Zeng1234");
        user.setEmail("15160000933@163.com");
        user.setNickname("小红");
        user.setTel("15160000933");

        System.out.println("插入之前:"+user.getId());
        int auto_id=userMapper.insert(user);
        System.out.println("插入返回值:"+auto_id);
        System.out.println("插入之后:"+user.getId());

    }

    @Test
    public void activeUser() {

    }
}