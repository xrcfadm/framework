package springTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springTest.entity.User;
import springTest.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public User getUser(){
        System.out.println("do UserController");
        return userService.getUser();
    }
}
