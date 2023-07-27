package com.example.kafkaproducer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/producer")
public class ProducerController {
    private static final String TOPIC = "string_topic";

    private final KafkaTemplate<Integer, String> kafkaTemplate;

    @GetMapping
    public String sendMessage(){
        kafkaTemplate.send(TOPIC, "Message from producer");

        return "Message sent to Kafka";
    }
}
