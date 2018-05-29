package com.demo.service;

import com.demo.pojo.Result;
import com.demo.pojo.User;

public interface UserService {
    public int login(User user);
    public User getUserByUsername(String username);

    public Result insertUser(User user);

    public Result activeUser(int id,String code);
}
