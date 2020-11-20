package com.baeldung.transformer;

import com.baeldung.consumer.AvroConsumer;
import com.baeldung.schema.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Service;

@Service
public class Transformer {

  private static final Logger LOGGER = LoggerFactory.getLogger(Transformer.class);

  @StreamListener(TransformerStreams.INPUT)
  public void transform(Employee employeeDetails) {
    LOGGER.info("Let's process employee details: {}", employeeDetails);
  }

}
