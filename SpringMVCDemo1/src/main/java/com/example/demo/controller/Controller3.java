package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller3 {
    // 三、参数重命名
    @RequestMapping("/m3")
    public String method_3(@RequestParam(value = "name", required = false) String username, String password){
        System.out.println("==============================");
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        System.out.println("==============================");
        return  "后端参数重命名";
    }
}
