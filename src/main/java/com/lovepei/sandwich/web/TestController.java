package com.lovepei.sandwich.web;

import com.lovepei.sandwich.domain.User;
import com.lovepei.sandwich.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by cumt_cx on 2017/1/6.
 */
@RestController
public class TestController {

    private final  static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/")
    public String home() {
        return "Hello World!";
    }

    @ResponseBody
    @RequestMapping(value="/getUser")
    public User getUser(){
        User user = userService.getUser("admin");
        logger.debug(user.toString());
        return user;
    }
}
