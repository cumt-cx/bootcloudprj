package com.lovepei.sandwich.rabbit.objectDirectType;

import com.lovepei.sandwich.domain.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by cumt_cx on 2017/1/17.
 */
@Component
public class ObjectDirectSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(User user){
        System.out.println("Sender Object :"+user.toString());
        rabbitTemplate.convertAndSend("fuqObject",user);
    }

}
