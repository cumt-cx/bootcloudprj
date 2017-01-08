package com.lovepei.sandwich.service;

import com.lovepei.sandwich.domain.User;

/**
 * Created by cumt_ on 2017/1/8.
 */
public interface UserService {
    Integer login(String userName, String passWord);

    User getUser(String userNameId);
}
