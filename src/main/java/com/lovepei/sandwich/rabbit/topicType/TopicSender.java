package com.lovepei.sandwich.rabbit.topicType;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by cumt_cx on 2017/1/17.
 */
@Component
public class TopicSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String context = "hi ,i am message for all";
        System.out.println("TopicSend for topic.1 :["+context+"]");
        rabbitTemplate.convertAndSend("topicExchange","topic.1",context);
    }

    public void send1() {
        String context = "hi, i am message 1 for message";
        System.out.println("TopSender1 : " + context);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.message", context);
    }

    public void send2() {
        String context = "hi, i am messages 2 for topic.messages ";
        System.out.println("TopSender2 : " + context);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.messages", context);
    }

}
