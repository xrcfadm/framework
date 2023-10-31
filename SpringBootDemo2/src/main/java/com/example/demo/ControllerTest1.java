package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

//@Slf4j
@Controller
@ResponseBody
public class ControllerTest1 {
    private static final Logger log = LoggerFactory.getLogger(ControllerTest1.class);

//    @PostConstruct//构造方法
//    public void doPostConstruct(){
//        System.out.println("========================================");
//        log.trace("I'm trace");
//        log.debug("I'm debug");
//        log.info("I'm info");  // 默认的日志级别
//        log.warn("I'm warn");
//        log.error("I'm error");
//        System.out.println("========================================");
//
//    }

    @RequestMapping("/test/fuc")
    public String func(){
        System.out.println("========================================");
        log.trace("I'm trace");
        log.debug("I'm debug");
        log.info("I'm info");  // 默认的日志级别
        log.warn("I'm warn");
        log.error("I'm error");
        System.out.println("========================================");
        return "succeed!";
    }
}
