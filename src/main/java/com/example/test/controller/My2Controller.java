package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class My2Controller {

    @GetMapping("/hello")
    public String hello() {

        return "111";
    }
}
