package com.msteam.nutaxi.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {
	
	@Value("${bar:(not provided)}")
	private String bar;

	@Autowired
	private Environment environment;
	
	@RequestMapping("/")
    public String home() {
        return String.format("Hello %s World! (%s)", bar, environment.getProperty("bar"));
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
	
}
