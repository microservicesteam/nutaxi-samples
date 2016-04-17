package com.msteam.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class HelloConfig {

    @Value("${greeting}")
    private String greeting;

    @Bean
    public HelloAutoController helloAutoController() {
        return new HelloAutoController(greeting);
    }

    @PostConstruct
    public void printProperties(){
        System.out.println("Property: greeting = " + greeting);
    }
}