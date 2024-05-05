package com.yetao;

import jakarta.annotation.Resource;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * @path: com.yetao.Test
 * @author: yetaowu
 * @date: 2024/05/05 16:48
 * @description:
 * @version: v1.0
 */

@SpringBootTest
public class Test1 {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    @Test
    public void TestKafka(){

        kafkaTemplate.send("test", "name", "2222222");
    }
}
