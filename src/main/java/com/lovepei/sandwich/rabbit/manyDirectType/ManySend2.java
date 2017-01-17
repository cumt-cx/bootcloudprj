package com.lovepei.sandwich.rabbit.manyDirectType;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by cumt_cx on 2017/1/17.
 */
@Component
public class ManySend2 {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i){
        String context = "spirng fuq ManySend2 queue"+" ****** "+i;
        System.out.println("Sender2 : " + context);
        this.rabbitTemplate.convertAndSend("fuq", context);
    }
}
