package com.hei.demo.entity;

import com.hei.demo.endpoint.event.model.PojaEvent;
import java.time.Duration;

public class SendEmailRequested extends PojaEvent {
  private String to;

  @Override
  public Duration maxConsumerDuration() {
    return Duration.ofSeconds(45);
  }

  @Override
  public Duration maxConsumerBackoffBetweenRetries() {
    return Duration.ofSeconds(30);
  }
}
