package com.spring.boot.aop.aop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "this is test()";
    }
}
