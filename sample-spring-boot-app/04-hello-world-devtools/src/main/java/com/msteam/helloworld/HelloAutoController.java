package com.msteam.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAutoController {
    private static final String NAME = "World";
    private final String greeting;

    public HelloAutoController(String greeting) {
        this.greeting = greeting;
    }

    @RequestMapping("/")
    public String greet() {
        return String.format("%s %s!", greeting, NAME);
    }
}
