package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import test.entity.User;

@Controller
public class UserController2 {
    @Autowired
    private User user;

    public void run(){
        System.out.println("UserController2"+user);
    }
}
