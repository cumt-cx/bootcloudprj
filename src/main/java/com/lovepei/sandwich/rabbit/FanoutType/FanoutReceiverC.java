package com.lovepei.sandwich.rabbit.FanoutType;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by cumt_ on 2017/1/17.
 */
@Component
@RabbitListener(queues = "fanout.C")
public class FanoutReceiverC {
    @RabbitHandler
    public void process(String message) {
        System.out.println("fanout Receiver C: " + message);
    }
}
