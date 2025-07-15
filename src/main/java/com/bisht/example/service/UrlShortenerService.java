package com.bisht.example.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bisht.example.UrlShortenerApplication;
import com.bisht.example.util.Base62Encoder;

@Service
public class UrlShortenerService {

	private static final Logger logger = LoggerFactory.getLogger(UrlShortenerService.class);
	private final Map<String, String> shortToLong = new HashMap<>();
    private final Map<String, String> longToShort = new HashMap<>();
    private int id = 1;

    public String shortenUrl(String longUrl) {
        if (longToShort.containsKey(longUrl)) {
            return longToShort.get(longUrl);
        }

        String shortKey = Base62Encoder.encode(id++);
        logger.info("shortKey {} ", shortKey);
        shortToLong.put(shortKey, longUrl);
        longToShort.put(longUrl, shortKey);
        return "http://localhost:8080/api/" + shortKey;
    }

    public String getLongUrl(String shortKey) {
        return shortToLong.get(shortKey);
    }
}