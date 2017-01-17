package com.lovepei.sandwich.rabbit;

import com.lovepei.sandwich.domain.User;
import com.lovepei.sandwich.rabbit.manyDirectType.ManySend1;
import com.lovepei.sandwich.rabbit.manyDirectType.ManySend2;
import com.lovepei.sandwich.rabbit.objectDirectType.ObjectDirectSender;
import com.lovepei.sandwich.rabbit.oneDirectType.DirectSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by cumt_cx on 2017/1/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DirectTypeTest {

    @Autowired
    private DirectSender directSender;

    @Autowired
    private ManySend1 manySend1;

    @Autowired
    private ManySend2 manySend2;

    @Autowired
    private ObjectDirectSender objectSender;

    @Test
    public void testdirectSender(){
        directSender.send();
    }

    /**
     * 一个发送者发往多个消费者，预计均匀接收到消息
     */
    @Test
    public void testOne2Many(){
        for(int i=0;i<50;i++){
            manySend1.send(i);
        }
    }

    /**
     * 多个发送者，多个接收者。预计接收端依然均匀接收到消息
     */
    @Test
    public void testMany2Many(){
        for(int i=0;i<50;i++){
            manySend1.send(i);
            manySend2.send(i);
        }
    }

    @Test
    public void testOjectSend(){
        User user = new User();
        user.setUserName("testObjectSend");
        user.setPassWord("don't tell you!");
        objectSender.send(user);
    }

}
