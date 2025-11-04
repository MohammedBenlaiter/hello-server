package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class Hello {

    @RequestMapping("")
    public String sayHello() {
        return "Hello, World!";
    }
}
