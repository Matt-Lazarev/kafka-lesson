package com.example.kafkaconsumer.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaController {
    private static final String TOPIC = "string_topic";

    @KafkaListener(topics = TOPIC)
    public void consumeString(String value){
        System.out.println("Consumed from producer: " + value);
    }
}
