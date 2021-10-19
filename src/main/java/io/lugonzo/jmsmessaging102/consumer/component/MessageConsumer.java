package io.lugonzo.jmsmessaging102.consumer.component;

import io.lugonzo.jmsmessaging102.model.SystemMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageConsumer {

    @JmsListener(destination = "bridgingcode.queue")
    public void messageListener(SystemMessage systemMessage){
        log.info("#####   Message received ,{} 🤪🤪🤪",systemMessage);
    }
}
