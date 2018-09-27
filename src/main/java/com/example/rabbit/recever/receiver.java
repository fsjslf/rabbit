package com.example.rabbit.recever;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="queue")    //监听器监听指定的Queue
public class receiver {

    @RabbitHandler
    public void processC(String str) {
        System.out.println("Receives:"+str);
    }
}

