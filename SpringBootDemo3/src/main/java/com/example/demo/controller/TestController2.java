package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j // 给当前类添加一个 名称为 log 的日志对象，相当于TestController中Slf4j包内Logger对象

public class TestController2 {
    @RequestMapping("/test/fuc2")
    public String func(){
        // 注意：使用LomBok的目的是为了在 log. 的时候，可以识别到@Slfj注解下的方法。
        log.error("this is a error");
        return "succeed!";
    }
}
