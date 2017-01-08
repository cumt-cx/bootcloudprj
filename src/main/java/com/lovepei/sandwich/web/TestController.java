package com.lovepei.sandwich.web;

import com.github.pagehelper.PageInfo;
import com.lovepei.sandwich.domain.User;
import com.lovepei.sandwich.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by cumt_cx on 2017/1/6.
 */
@RestController
public class TestController {

    private final  static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home() {
        return "Hello World!";
    }

    @ApiOperation(value="获取用户", notes="根据UserName获取对象")
    @ApiImplicitParam(name = "userName", value = "用户详细实体user", required = true, dataType = "String")
    @ResponseBody
    @RequestMapping(value="/getUser",method = RequestMethod.GET)
    public User getUser(@RequestParam(value="userName",required = true) String userName){
        User user = userService.getUser(userName);
        logger.debug(user.toString());
        return user;
    }

    @ResponseBody
    @RequestMapping(value="/getAllUser",method = RequestMethod.GET)
    public PageInfo<User> getAllUser(){
        return userService.getAllUser();
    }
}
