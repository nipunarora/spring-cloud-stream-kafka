package com.nipun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;

@SpringBootApplication
@EnableSchemaRegistryClient
public class AvroKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AvroKafkaApplication.class, args);
    }

}
