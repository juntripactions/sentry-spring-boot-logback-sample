package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/")
    void triggerError() {
        LOGGER.error("Error from Logback");
        throw new RuntimeException("Error from Spring");
    }
}
