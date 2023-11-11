package com.example.demo.controller;

import org.apache.catalina.Session;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class TestController {
    //1、获取Cookie
    @RequestMapping("/getCookie")
    public String func_1(@CookieValue("JSESSIONID") String cookie){
        return "cookie" + cookie;
    }

    //2、获取header
    @RequestMapping("/getHeader")
    public String func_2(@RequestHeader("User-Agent") String headerMsg){
        return headerMsg;
    }


    //3、设置和获取session
    @RequestMapping("/setSession")
    public String func_3(HttpServletRequest request){
        HttpSession session = (HttpSession) request.getSession(true);
        if (session != null){
            session.setAttribute("username", "张三");
        }
        return "set session succeed!";
    }
    @RequestMapping("/getSession")
    public String func_4(@SessionAttribute(value = "username", required = false)
                                     String uname){
        return "username:" + uname;
    }
}