package com.example.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class My4Controller {
    @Value("${appname}")
    String name;

    @GetMapping("/test")
    public String test(){
        return this.name;
    }


}
