package com.example.kafkaload;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Component
public class KafkaConsumer {

    @Value("${svc.kafka.consumer.group-id}")
    private String groupId;



    @KafkaListener(topics = "${svc.kafka.topic.name}",
            groupId = "${svc.kafka.consumer.group-id}")
    public void listenPerspectiveJobScheduler
            (@Payload String payload, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) throws InterruptedException {
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("======= Received : " + payload + " -- " +
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                        .format(now));
        Thread.sleep(5000);
    }
}
