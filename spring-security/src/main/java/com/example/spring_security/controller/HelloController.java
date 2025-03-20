package com.example.spring_security.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String homePage(HttpServletRequest request){
        return "Hello from Amber !! " + request.getSession().getId();
    }
}
