package com.pkpeaks.miniserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController // tells Spring: methods in this class return data (JSON), not HTML pages
public class MiniserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniserverApplication.class, args);
	}

	// Endpoint 1: http://localhost:8080/hello
	@GetMapping("/hello")
	public Map<String, String> hello() {
		return Map.of("message", "Hello, world!");
	}

	// Endpoint 2: http://localhost:8080/status
	@GetMapping("/status")
	public Map<String, Object> status() {
		return Map.of(
				"status", "running",
				"timestamp", System.currentTimeMillis()
		);
	}

}