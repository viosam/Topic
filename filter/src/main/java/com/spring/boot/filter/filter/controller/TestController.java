package com.spring.boot.filter.filter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    public String testFilter(){
        String str = "test。。。";
        return str;
    }
}
