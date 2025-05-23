package com.example.WelcomeSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/welcome")
    public String welcome(){
        System.out.println("Welcome to Spring Boot!");
        return "Hello, Welcome to Spring Boot!";
    }
}
