package com.iagomoreira.urbanflow.service.common;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class DateTimeProvider {

	public LocalDateTime now() {
		return LocalDateTime.now();
	}

	public LocalDateTime utcNow() {
		return LocalDateTime.now(java.time.Clock.systemUTC());
	}
}