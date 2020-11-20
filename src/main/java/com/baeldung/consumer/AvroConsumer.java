package com.baeldung.consumer;

import com.baeldung.schema.Employee;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class AvroConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(AvroConsumer.class);

    @Bean
    public Consumer<Employee> receive() {
        return data -> LOGGER.info("The consumer received the following details {}", data);
    }

}
