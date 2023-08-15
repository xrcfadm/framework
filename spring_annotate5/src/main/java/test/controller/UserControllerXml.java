package test.controller;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import test.entity.User;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UserControllerXml implements BeanNameAware {
    @Autowired
    private User user;

    @Override
    public void setBeanName(String s) {
        System.out.println("do aware!(执行各种通知)");
    }

    @PostConstruct
    public void doPostStruct(){
        System.out.println("do PostStruct(初始化方法 )");
    }

    public void run(){
        System.out.println("使用Bean: "+user);
    }

    @PreDestroy
    public void doPreDestroy(){
        System.out.println("销毁Bean：");
    }
}
