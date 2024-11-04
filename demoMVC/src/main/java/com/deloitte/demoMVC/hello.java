package com.deloitte.demoMVC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/")
    public String hello(){
        return "hello world arpit";
    }
}
