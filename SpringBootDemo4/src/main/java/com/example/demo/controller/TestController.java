package com.example.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static Logger log = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/test/fuc")
    public String func(){
        System.out.println("==============================");
        log.info("this is a info");
        System.out.println("==============================");

        return "succeed!";
    }
}
