package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        System.out.println("About");

        return "안녕하세요";
    }

    public void contact() {
        System.out.println("Contact");
    }
}
