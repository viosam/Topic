package com.spring.boot.exception.handle;

import com.spring.boot.exception.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionHandler {


    //拦截登录异常
//    @ExceptionHandler(value = MyException.class)
//    public ModelAndView handlerMyException() {
//
//        return new ModelAndView("redirect:"
//                .concat("/admin/toLogin"));
//    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public String handlerMyException(MyException e){
        return "this is my handler exception";

    }
}
