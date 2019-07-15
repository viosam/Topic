package com.spring.boot.exception.controller;

import com.spring.boot.exception.exception.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class TestController {

    @RequestMapping("/test")
    public void testException(){
        throw new MyException();
    }
}
