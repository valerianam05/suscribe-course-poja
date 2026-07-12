package com.hei.demo.entity;

import java.time.Instant;

public record SubcriptionRecord(String id, Long userId, Long courseId, Instant subscribedAt) {}
