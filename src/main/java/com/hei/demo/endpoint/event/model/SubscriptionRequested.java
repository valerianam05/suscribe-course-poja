package com.hei.demo.endpoint.event.model;

import java.time.Duration;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
public class SubscriptionRequested extends PojaEvent {
  private String userId;
  private String courseId;
  private String userEmail;
  private String userName;
  private String courseTitle;
  private String courseDescription;
  private Double coursePrice;
  private String pdfUrl;

  @Override
  public Duration maxConsumerDuration() {
    return Duration.ofSeconds(45);
  }

  @Override
  public Duration maxConsumerBackoffBetweenRetries() {
    return Duration.ofSeconds(30);
  }
}
