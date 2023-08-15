package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import test.entity.User;

@Controller
public class UserController {
    @Autowired
    private User user;

    public void run(){
        // user和tmp是指向的同一个引用，tmp改变，user自然也改变
        System.out.println("原user"+user);
        User tmp = user;
        tmp.setId(2);
        tmp.setName("lihua");
        System.out.println("tmp"+tmp);
        System.out.println("给tmp赋值后的user"+user);
        System.out.println("====================");
    }
}
