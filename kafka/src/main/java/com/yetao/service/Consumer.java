package com.yetao.service;

import jakarta.annotation.Resource;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @path: com.yetao.controller.Consumer
 * @author: yetaowu
 * @date: 2024/05/05 17:23
 * @description:
 * @version: v1.0
 */

@Component
public class Consumer {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;


    @KafkaListener(topics = "test", groupId = "0")
    public void listen(ConsumerRecord<?, ?> record) {
        String topic = record.topic();
        String message = (String) record.value();
        System.out.println("Received message in " + topic + ": " + message);
    }
}

