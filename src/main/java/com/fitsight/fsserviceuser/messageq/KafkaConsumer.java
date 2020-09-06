package com.fitsight.fsserviceuser.messageq;

import com.fitsight.fsserviceuser.messageq.envelop.UserMessage;
import com.fitsight.fsserviceuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @Autowired
    UserRepository userRepository;

    @KafkaListener(topics = "fs-user-topic", containerFactory = "userListenerContainerFactory")
    public void processUserMessage(UserMessage message) {

        System.out.println("Received Message for User group: " + message);
        userRepository.save(message.toUser());
    }
}
