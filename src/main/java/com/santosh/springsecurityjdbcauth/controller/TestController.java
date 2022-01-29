package com.santosh.springsecurityjdbcauth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping(value = "admin/welcome")
    public String welcomeAdmin() {
        return "Welcome Admin !";
    }

    @GetMapping(value = "user/welcome")
    public String welcomeUser() {
        return "Welcome User !";
    }

    @GetMapping
    public String welcome() {
        return "Welcome page !";
    }

    @GetMapping(value = "hello")
    public String hello() {
        return "Hello visitor !";
    }
}
