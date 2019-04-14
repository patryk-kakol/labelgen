package com.protolab.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// TEMPORARY
@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }
}
