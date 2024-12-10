package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public void home() {
        System.out.println("Home");
    }

    @GetMapping("/about")
    public void about() {
        System.out.println("About");
    }
}
