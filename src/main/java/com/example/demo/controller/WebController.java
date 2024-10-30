package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class WebController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
