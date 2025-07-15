package com.bisht.example.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bisht.example.service.UrlShortenerService;

@RestController
@RequestMapping("/api")
public class UrlShortenerController {

    @Autowired
    private UrlShortenerService service;

    @PostMapping("/shorten")
    public String shortenUrl(@RequestParam String longUrl) {
        return service.shortenUrl(longUrl);
    }

    @GetMapping("/{shortUrl}")
    public ResponseEntity<?> redirect(@PathVariable String shortUrl) {
        String longUrl = service.getLongUrl(shortUrl);
        return longUrl != null
                ? ResponseEntity.status(HttpStatus.FOUND).location(URI.create(longUrl)).build()
                : ResponseEntity.status(HttpStatus.NOT_FOUND).body("URL not found");
    }
}