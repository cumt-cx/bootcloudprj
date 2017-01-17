package com.lovepei.sandwich.rabbit.FanoutType;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by cumt_ on 2017/1/17.
 */
@Component
public class FanoutSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String context = "hi ,i am fanout msg";
        System.out.println("Send fanout ["+context+"]");
        rabbitTemplate.convertAndSend("fanoutExchange","",context);
    }

}
