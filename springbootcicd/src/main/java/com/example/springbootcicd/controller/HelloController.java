package com.example.springbootcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot is alive 🚀";
    }

     @GetMapping("/name")
    public String sayHello(@RequestParam(defaultValue = "Spring Boot") String name) {
        return "Hello bawa";
    }

    @GetMapping("/greet")
    public String greetUser(@RequestParam(defaultValue = "Guest") String name) {
        return "Hello, " + name + "!";
    }
}