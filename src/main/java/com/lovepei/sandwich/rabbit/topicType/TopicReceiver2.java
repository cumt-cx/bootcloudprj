package com.lovepei.sandwich.rabbit.topicType;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by cumt_cx on 2017/1/17.
 */
@Component
@RabbitListener(queues = "topic.messages")
public class TopicReceiver2 {
    @RabbitHandler
    public void process(String messages){
        System.out.println("Topic Receiver2  : " + messages);
    }
}
