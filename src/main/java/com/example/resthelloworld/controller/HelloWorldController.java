package com.example.resthelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/rest")
public class HelloWorldController {

    @GetMapping("/hello-world")
    public Map<String, String> greeting() {
        return Map.of("Hello", "World!");
    }

}
