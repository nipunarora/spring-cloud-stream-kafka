package com.nipun.transformer;

import com.nipun.schema.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Service
public class Transformer {

  private static final Logger LOGGER = LoggerFactory.getLogger(Transformer.class);

  //@StreamListener(TransformerStreams.INPUT)
  public void transform(Employee employeeDetails) {
    LOGGER.info("Let's process employee details: {}", employeeDetails);
  }

}
