package com.spring.demo;

import org.springframework.stereotype.Controller;

//@Controller实现 bean 存储(@Service,@Repository,@Component,@Configuration 也可进行 bean 存储)
@Controller
public class Student {
    public String name;

    public void wmi(){
        System.out.println("I am a student, my name is " + name);
    }
}
