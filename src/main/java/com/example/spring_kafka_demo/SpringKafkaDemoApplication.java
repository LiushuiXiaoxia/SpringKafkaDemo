package com.example.spring_kafka_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringKafkaDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringKafkaDemoApplication.class, args);

        KafkaSender sender = context.getBean(KafkaSender.class);
        for (int i = 0; i < 3; i++) {
            sender.send();

            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}