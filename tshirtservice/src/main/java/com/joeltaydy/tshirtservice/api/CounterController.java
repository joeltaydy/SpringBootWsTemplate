package com.joeltaydy.tshirtservice.api;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {

    private AtomicLong count = new AtomicLong(0L);

    @Value("${counter.prefixMessage}")
    private String prefixMessage;

    @GetMapping(path = "/count")
    public String getCount() {
        return prefixMessage + count.getAndIncrement();
    }
}