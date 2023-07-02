package com.example.kafkaload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class KafkaLoadApplication {


    public static void main(String[] args) throws IOException {
        SpringApplication.run(KafkaLoadApplication.class, args);

        for (int i = 0; i < 3; i++) {
            Runtime.getRuntime().exec("java MyApplication --" + i);
        }

    }


}
