package com.offcn.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String demo(){
        return "hello," + port;
    }
}
