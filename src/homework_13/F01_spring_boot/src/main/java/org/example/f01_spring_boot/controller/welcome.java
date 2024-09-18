package org.example.f01_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
    @GetMapping("/welcome")
    public String welcomeSpring() {

        return "Hello course online project";
    }
}
