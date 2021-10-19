package io.lugonzo.jmsmessaging102.publisher.controller;

import io.lugonzo.jmsmessaging102.model.SystemMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/message")
public class PublishController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping
    public ResponseEntity<String> publishMessage(@RequestBody SystemMessage systemMessage){
        try{
            jmsTemplate.convertAndSend("bridgingcode.queue",systemMessage);
            return new ResponseEntity<>("Sent Sucessfully 🥳🥳🥳",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
}
