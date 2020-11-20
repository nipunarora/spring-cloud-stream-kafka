package com.baeldung.transformer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;


public interface TransformerStreams{
  
}

    /*
    extends Processor {
  String INPUT = "transformer-in";
  String OUTPUT = "transformer-out";

  @Input(INPUT)
  SubscribableChannel inboundGreetings();

  @Output(OUTPUT)
  MessageChannel outboundGreetings();
}

     */