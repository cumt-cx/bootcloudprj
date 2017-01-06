package com.lovepei.sandwich;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cumt_cx on 2017/1/6.
 */
@RestController
@SpringBootApplication
public class Application {

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    @ResponseBody
    @RequestMapping(value = "/")
    String home() {
        return "Hello World!";
    }
}
