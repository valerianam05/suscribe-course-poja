package com.hei.demo.endpoint.event.consumer.model;

import com.hei.demo.PojaGenerated;
import com.hei.demo.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
