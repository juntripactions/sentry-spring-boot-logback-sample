package com.example.demo;

import java.util.UUID;

import org.springframework.stereotype.Component;

import io.sentry.EventProcessor;
import io.sentry.SentryEvent;

@Component
public class CustomEventProcessor implements EventProcessor {

	@Override
	public SentryEvent process(SentryEvent event, Object hint) {
		event.setTag("requestUuid", UUID.randomUUID().toString());
		return event;
	}
}
