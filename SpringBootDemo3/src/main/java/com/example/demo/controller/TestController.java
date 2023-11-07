package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
//等价于RestController
@RequestMapping("/test")
public class TestController {
    //注意：选择slf4j类型的Logger定义
    private static final Logger log =LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/active")
    public String active(){
        System.out.println("==================================");
        log.trace("this is a trace");
        log.debug("this is a debug");
        log.info("this is a info");
        log.warn("this is a warn");
        log.error("this is a error");
        System.out.println("==================================");
        return "hello trace";
    }
}
