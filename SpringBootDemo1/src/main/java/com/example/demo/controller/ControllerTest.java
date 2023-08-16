package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody    //类(方法)加上这个注解，告诉当前类(方法)的方法返回的是非静态页面的数据

@RequestMapping("/test")
public class ControllerTest {
    // .properties和.yml的配置信息获取演示
    @Value("${car.body.tire}")   //@Value：从springboot配置文件.properties 中获取配置信息(类似于依赖注入)
    private String myConfigTire;

    @RequestMapping("/configRun")
    public String configRun(){
        return ".yml test -> myConfigTire:" + myConfigTire;
    }
}
