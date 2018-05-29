package com.demo.mapper;

import com.demo.pojo.User;

public interface UserMapper {
    User getUserByUsernameAndPassword(User user);
    User getUserByUsername(String username);
    int insert(User user);
    int updateUserState(int id,int state);
}
