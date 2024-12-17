package com.example.mqdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    @Autowired
    private JmsTemplate jmsTemplate;
    public void sendMessage(String message){
        jmsTemplate.convertAndSend("test.queue",message);
    }
    
}
