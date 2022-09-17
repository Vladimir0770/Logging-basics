package com.company.logging.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String homePage() {
        logger.info("Home page accessed");
        return "This is the home page of this web application";
    }

    @GetMapping("/info")
    public String infoPage() {
        logger.info("Info page accessed");
        return "The aim of this app is to show basics of logging";
    }
}
