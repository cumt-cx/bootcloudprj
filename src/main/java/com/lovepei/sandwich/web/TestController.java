package com.lovepei.sandwich.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cumt_cx on 2017/1/6.
 */
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/")
    public String home() {
        return "Hello World!";
    }

    @ResponseBody
    @RequestMapping(value="/getUser")
    public String getUser(){
        return "";
    }
}
