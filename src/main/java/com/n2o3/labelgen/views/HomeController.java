package com.n2o3.labelgen.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// temporary
@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "index";
    }
}
