package com.accesslog.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/demo")
    String demo(){
        logger.info("Hello world info");
        logger.debug("Hello world debug");
        return "Hello World!!!";
    }
}
