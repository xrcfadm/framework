package com.example.demo.controller;

import com.example.demo.component.StudentComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@Controller
public class ControllerTest2 {
    @Autowired //.yml获取对象时，需要使用依赖注入的方式获取配置的一个对象
    private StudentComponent studentComponent;

    @PostConstruct //初始化方法
    public void doPostConstruct(){
        System.out.println("=====================");
        System.out.println(studentComponent);
        System.out.println("=====================");
    }
}
