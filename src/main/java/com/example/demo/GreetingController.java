package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template="Hello %s";
    private static final AtomicLong counter=new AtomicLong();
    @GetMapping("/greeting")
    Greeting greetings(@RequestParam(defaultValue = "World") String name){
        return new Greeting(String.format(template,name),counter.incrementAndGet());
    }
}
