package com.deloitte.demoMVC;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @Value("${user}")
    private String user;
    @GetMapping("/")
    public String hello(){
        return "hello world "+user;
    }
}
