package com.lovepei.sandwich.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lovepei.sandwich.domain.User;
import com.lovepei.sandwich.mappers.UserMapper;
import com.lovepei.sandwich.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override public PageInfo<User> getAllUser() {
        PageHelper.startPage(1,1);
        List<User> userList = userMapper.findAllUser();
        PageInfo<User> pageInfos = new PageInfo<>(userList);
        return pageInfos;
    }
}
