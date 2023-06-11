package com.example.apiTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping("/api")
    public String getApi(){
        return "Hello World";
    }
}
