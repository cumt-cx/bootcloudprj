package com.lovepei.sandwich.rabbit.manyDirectType;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by cumt_cx on 2017/1/17.
 */
@Component
public class ManySend1 {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i){
        String context = "spirng boot fuq queue"+" ****** "+i;
        System.out.println("Sender1 : " + context);
        this.rabbitTemplate.convertAndSend("fuq", context);
    }
}
