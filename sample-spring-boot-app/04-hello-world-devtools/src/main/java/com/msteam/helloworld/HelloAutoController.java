package com.msteam.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloAutoController {
    private static final String NAME = "World";
    private final String greeting;

    public HelloAutoController(String greeting) {
        this.greeting = greeting;
    }

    @RequestMapping("/")
    public String greeting(Model model) {
        model.addAttribute("greeting", greeting);
        model.addAttribute("name", NAME);
        return "hello";
    }
}
