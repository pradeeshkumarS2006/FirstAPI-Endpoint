package com.pkpeaks.miniserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class MiniserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniserverApplication.class, args);
    }

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of(
                "message", "Hello, World!"
        );
    }

    @GetMapping("/status")
    public Map<String, String> status() {
        return Map.of(
                "status", "Server is running"
        );
    }
}
