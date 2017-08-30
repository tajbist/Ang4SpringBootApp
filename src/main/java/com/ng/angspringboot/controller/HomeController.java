package com.ng.angspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/api/check")
    public String check() {
        return "Spring Boot App";
    }
}
