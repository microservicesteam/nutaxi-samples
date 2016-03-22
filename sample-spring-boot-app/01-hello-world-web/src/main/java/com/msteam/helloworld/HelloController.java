package com.msteam.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    String greetUser() {
        return "Welcome to NuTaxi";
    }
}
