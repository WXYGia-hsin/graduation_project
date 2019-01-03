package com.wxy.blog.controllertest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerTest {


    @RequestMapping("/hello")
    public String hello(){
        return "yes";
    }
}

