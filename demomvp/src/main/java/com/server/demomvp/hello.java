package com.server.demomvp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @Value("${name}")
    private String name;
    @GetMapping("/")
    public String hello(){
        return "hello world "+name;
    }
}

