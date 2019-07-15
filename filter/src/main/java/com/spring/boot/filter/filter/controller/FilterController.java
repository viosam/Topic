package com.spring.boot.filter.filter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filter")
public class FilterController {

    @RequestMapping("/testFilter")
    public String testFilter(){
        String str = "控制台会先打印filter里面的内容。。。";
        return str;
    }
}
