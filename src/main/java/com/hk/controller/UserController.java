package com.hk.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String users(Integer age){
        log.info("test:{}", age);
        return "<h1>all users: v1.0.2</h>";
    }
}
