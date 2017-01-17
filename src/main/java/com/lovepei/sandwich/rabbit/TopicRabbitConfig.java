package com.lovepei.sandwich.rabbit;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cumt_cx on 2017/1/17.
 */
@Configuration
public class TopicRabbitConfig {

    private final static String message = "topic.message";
    private final static String messages = "topic.messages";

    @Bean
    public Queue queueMessage(){
        return new Queue(message);
    }

    @Bean
    public Queue queueMessages(){
        return new Queue(messages);
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange("topicExchange");
    }

    @Bean
    public Binding bindingExchageMessage(Queue queueMessage,TopicExchange exchange){
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }

    @Bean
    public Binding bindingExchageMessages(Queue queueMessages, TopicExchange exchange){
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }


}
