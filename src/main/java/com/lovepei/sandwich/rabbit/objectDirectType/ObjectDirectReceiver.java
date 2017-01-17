package com.lovepei.sandwich.rabbit.objectDirectType;

import com.lovepei.sandwich.domain.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by cumt_cx on 2017/1/17.
 */
@Component
@RabbitListener(queues = "fuqObject")
public class ObjectDirectReceiver {

    @RabbitHandler
    public void process(User user){
        System.out.println("Receive Object ["+user.toString()+"]");
    }
}
