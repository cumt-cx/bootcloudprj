package com.lovepei.sandwich.service.impl;

import com.lovepei.sandwich.domain.User;
import com.lovepei.sandwich.mappers.UserMapper;
import com.lovepei.sandwich.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cumt_ on 2017/1/8.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override public Integer login(String userName, String passWord) {
        return null;
    }

    @Override public User getUser(String userName) {
        User user = userMapper.findByName(userName);
        return user;
    }
}
