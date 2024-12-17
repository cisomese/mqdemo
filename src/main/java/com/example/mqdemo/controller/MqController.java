package com.example.mqdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.mqdemo.service.Producer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/mqdemo")
public class MqController {
    @Autowired
    private Producer producer;
    @PostMapping("/send")
    public String getMessage(@RequestBody String message) {
        producer.sendMessage(message);
        return "message sent "+message;
    }
   
    
    

    
}
