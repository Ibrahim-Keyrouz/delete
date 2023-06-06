package com.example.delete.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;
@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController {
    @Value("${message:Hello default}")
    private String message;
    @GetMapping("/get")

    public String returnString() {
        return "hello";
    }




    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }


}
