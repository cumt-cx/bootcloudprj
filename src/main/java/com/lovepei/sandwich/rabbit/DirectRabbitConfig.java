package com.lovepei.sandwich.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by cumt_cx on 2017/1/17.
 */
@Configuration
public class DirectRabbitConfig {

    @Bean
    public Queue directHelloQueue(){
        return new Queue("directHello");
    }

    @Bean
    public Queue fuqQueue(){
        return new Queue("fuq");
    }

    @Bean
    public Queue  fuqObjectQueue(){
        return new Queue("fuqObject");
    }
}
