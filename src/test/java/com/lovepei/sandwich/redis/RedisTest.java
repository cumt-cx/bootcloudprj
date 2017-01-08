package com.lovepei.sandwich.redis;

import com.lovepei.sandwich.domain.User;
import com.lovepei.sandwich.mappers.UserMapperTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by cumt_ on 2017/1/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    private final static Logger logger = LoggerFactory.getLogger(RedisTest.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    public void testStringRedis(){
        //保存字符串
        stringRedisTemplate.opsForValue().set("testString","lovepei Test");
        Assert.assertEquals("lovepei Test",stringRedisTemplate.opsForValue().get("testString"));
    }

    @Test
    public void testStringObj(){
        User user = new User();
        user.setUserName("testRedis");
        user.setPassWord("hehe233");
        redisTemplate.opsForValue().set("testRedis",user);
        logger.debug("User = [testRedis] and redis getValue = ["+redisTemplate.opsForValue().get("testRedis")+"]");
        User redisUser = (User) redisTemplate.opsForValue().get("testRedis");
        Assert.assertEquals("hehe233", redisUser.getPassWord());
    }
}
