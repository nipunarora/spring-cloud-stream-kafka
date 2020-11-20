package com.nipun.producer;

import java.util.function.Supplier;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.nipun.schema.Employee;
import com.nipun.schema.EmployeeKey;

@Service
public class AvroProducer {

    @Bean
    public Supplier<Message<Employee>> produce(){
        Employee employee = new Employee();
        employee.setId(1003);
        employee.setFirstName("ABC");
        employee.setLastName("EFG");
        employee.setDepartment("IT");
        employee.setDesignation("Engineer");

        // creating partition key for kafka topic
        EmployeeKey employeeKey = new EmployeeKey();
        employeeKey.setId(1003);
        employeeKey.setDepartmentName("IT");

        Message<Employee> message = MessageBuilder.withPayload(employee)
            .setHeader(KafkaHeaders.MESSAGE_KEY, employeeKey)
            .build();

        return () -> message;
    }
}
