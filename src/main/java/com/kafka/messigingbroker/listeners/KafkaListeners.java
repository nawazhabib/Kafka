package com.kafka.messigingbroker.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "mytopic", groupId = "gId")
    void listeners(String data) {
        System.out.println("Listener Received Data: " + data);
    }
}
