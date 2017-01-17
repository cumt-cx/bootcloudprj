package com.lovepei.sandwich.rabbit.topicType;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by cumt_cx on 2017/1/17.
 */
@Component
@RabbitListener(queues = "topic.message")
public class TopicReciver1 {

    @RabbitHandler
    public void process(String message){
        System.out.println("Topic Receiver1  : " + message);
    }
}
