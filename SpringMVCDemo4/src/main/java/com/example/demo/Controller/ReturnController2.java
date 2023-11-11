package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReturnController2 {
    //1请求转发
    @RequestMapping("/forward")
    public Object func_1(){
        return "forward:index.html";
    }
    //2请求重定向
    @RequestMapping("/redirect")
    public Object func_2(){
        return "redirect:/index.html";
    }
}
