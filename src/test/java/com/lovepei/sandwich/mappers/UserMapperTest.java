package com.lovepei.sandwich.mappers;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lovepei.sandwich.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;



/**
 * Created by cumt_ on 2017/1/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    private final static Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findByName(){
        User user = userMapper.findByName("admin");
        logger.debug("admin = [admin] passWord = ["+user.getPassWord()+"]");
        System.out.println("User = [admin] passWord = ["+user.getPassWord()+"]");
    }

    @Test
    public void findAllUser(){
        PageHelper.startPage(1,1);
        List<User> userList = userMapper.findAllUser();
        PageInfo<User> pageInfos = new PageInfo<>(userList);
        logger.debug("pageInfos = ["+pageInfos+"]");
    }

}
