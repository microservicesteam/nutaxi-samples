package com.msteam.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public static final String WELCOME_REQUESTED_ON_LEVEL = "Welcome requested on {} level";
    Logger LOGGER = LoggerFactory.getLogger(HelloController.class);


    @RequestMapping("/")
    String greetUser() {
        LOGGER.trace(WELCOME_REQUESTED_ON_LEVEL, "TRACE");
        LOGGER.debug(WELCOME_REQUESTED_ON_LEVEL, "DEBUG");
        LOGGER.info(WELCOME_REQUESTED_ON_LEVEL, "INFO");
        LOGGER.warn(WELCOME_REQUESTED_ON_LEVEL, "WARN");
        LOGGER.error(WELCOME_REQUESTED_ON_LEVEL, "ERROR");
        return "Welcome to NuTaxi";
    }
}
