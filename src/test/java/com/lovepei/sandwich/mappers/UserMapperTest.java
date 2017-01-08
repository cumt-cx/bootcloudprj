package com.lovepei.sandwich.mappers;

import com.lovepei.sandwich.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


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
        logger.debug("admin = [admin] passWord = ["+user.getPassword()+"]");
        System.out.println("User = [admin] passWord = ["+user.getPassword()+"]");
    }

}
