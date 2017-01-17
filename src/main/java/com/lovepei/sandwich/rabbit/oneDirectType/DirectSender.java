package com.lovepei.sandwich.rabbit.oneDirectType;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by cumt_cx on 2017/1/17.
 */
@Component
public class DirectSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String context = "DirectType Message" + new Date();
        System.out.println("Sender send Message is ["+context+"]");
        rabbitTemplate.convertAndSend("directHello",context);
    }

}
