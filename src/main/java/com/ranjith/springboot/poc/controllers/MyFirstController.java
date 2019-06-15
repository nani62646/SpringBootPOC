package com.ranjith.springboot.poc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @GetMapping("/simpleGetEndpoint")
    public String simpleGetEndpoint(){
        return "Simple Get EndPoint";
    }
}
