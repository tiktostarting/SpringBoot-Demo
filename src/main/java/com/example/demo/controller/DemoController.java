package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping
    public String demo() {
        return "demo tester";
    }

    @RequestMapping("/goodbye")
    public String goodbye() {
        return "goodbye Spring boot";
    }
}
