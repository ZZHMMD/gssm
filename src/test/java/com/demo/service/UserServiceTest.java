package com.demo.service;

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

        userService.insertUser(user);

    }

    @Test
    public void activeUser() {

    }
}