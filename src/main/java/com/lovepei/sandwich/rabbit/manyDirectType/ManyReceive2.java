package com.lovepei.sandwich.rabbit.manyDirectType;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by cumt_cx on 2017/1/17.
 */
@Component
@RabbitListener(queues = "fuq")
public class ManyReceive2 {

    @RabbitHandler
    public void  process(String message){
        System.out.println("Receiver 2: " + message);
    }
}
