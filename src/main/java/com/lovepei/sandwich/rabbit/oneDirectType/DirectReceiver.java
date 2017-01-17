package com.lovepei.sandwich.rabbit.oneDirectType;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by cumt_cx on 2017/1/17.
 */
@Component
@RabbitListener(queues = "directHello")
public class DirectReceiver {

    @RabbitHandler
    public void process(String receiveMessage){
        System.out.println("Receive : "+receiveMessage);
    }

}
