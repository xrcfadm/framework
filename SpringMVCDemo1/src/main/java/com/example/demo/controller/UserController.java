package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody //返回一个数据
//<==> @RestController

@RequestMapping("/test")  // 路由
public class UserController {
    // 一、MVC连接
    // 法一：@RequestMapping注解实现连接
    @RequestMapping(value = {"/fuc", "/func"}, method = RequestMethod.POST)
    public String func(){
        return "<h1>Hello, Spring MVC<h1>";
    }

    // 法二：@GetMapping注解实现连接
    @GetMapping(value = {"/getMap"})
    public String getFunc(){
        return "<h1>GetMapping<h1>";
    }
}
