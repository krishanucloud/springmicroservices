package com.microservices.user.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@RefreshScope
public class UserController {
    @Value("${hello.message}")
    private String helloMessage;

    @GetMapping("fetch-all")
    public String fetchAllUser() {
        return helloMessage;
    }
}
