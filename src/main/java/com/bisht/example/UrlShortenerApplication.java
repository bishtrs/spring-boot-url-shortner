package com.bisht.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UrlShortenerApplication {
	
    private static final Logger logger = LoggerFactory.getLogger(UrlShortenerApplication.class);

	
	public static void main(String[] args) {
        logger.info("Starting Spring Boot Url Shortener Application...");
		SpringApplication.run(UrlShortenerApplication.class, args);
        logger.info("Spring Boot Boot Shortener Application started successfully.");

	}
}