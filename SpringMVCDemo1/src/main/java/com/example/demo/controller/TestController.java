package com.example.demo.controller;

import com.example.demo.controller.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@ResponseBody //保证返回内容是数据，而不是页面
@RequestMapping("/test")
public class TestController {
    // 二、参数传递
    //1.传递单个参数
    @RequestMapping("/m1")
    public Object method_1(String name){
        System.out.println("==============================");
        System.out.println("参数name:" + name);
        System.out.println("==============================");
        return "传递单个参数";
    }
    //2.传递对象
    @RequestMapping("/m2")
    public String method_2(Person p){
        System.out.println("==================================");
        System.out.println("p对象username:" + p.getUsername());
        System.out.println("p对象password:" + p.getPassword());
        System.out.println("==================================");
        return "传递对象";
    }
    //3.传Json对象
    @RequestMapping("/m4")
    public String method_4(@RequestBody Person p){ //@RequestBody，从请求体的方式获得，传的是Json对象，因此是用Json格式接收
        System.out.println("=================================");
        System.out.println(p.getUsername() + " " + p.getPassword());
        System.out.println("=================================");
        return "传Json对象";
    }
    //特别注意,上面部分都是参数部分传参，即 ? 后传参
    // 下面是：基础URL传参
    @RequestMapping("/m5/{name}/{pwd}")
    public String method_5(@PathVariable String name, @PathVariable String pwd){//@PathVariable注解表示，参数为基础URL传参。
        System.out.println("=================================");
        System.out.println(name + " " + pwd);
        System.out.println("=================================");
        return "基础URL传参";
    }
}
