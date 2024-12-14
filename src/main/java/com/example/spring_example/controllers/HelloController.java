package com.example.spring_example.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello()
    {
        return "hello";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/access")
    public String getAccess()
    {
        return "access";
    }
}
