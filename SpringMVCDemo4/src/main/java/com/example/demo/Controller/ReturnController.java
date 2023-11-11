package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 1返回静态页面 2返回text/html
@Controller
@ResponseBody
//@Controller+@ResponseBody《==》@RestController
public class ReturnController {
    @RequestMapping("/static")
    public Object func_1(){
        return "index.html";
    }
}
