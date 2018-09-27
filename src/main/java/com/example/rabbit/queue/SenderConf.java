package com.example.rabbit.queue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

@Configuration
public class SenderConf {
    @Bean
    public Queue queue() {
        return new Queue("queue");
    }
}
