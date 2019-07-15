package com.spring.boot.aop.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AopAspect {

    @Pointcut("execution(public * com.spring.boot.aop.aop.controller.TestController.*(..))"/* +
            "&& !execution(public * com.spring.boot.aop.aop.controller.TestController.toLogin(..))" +
            "&& !execution(public * com.spring.boot.aop.aop.controller.TestController.login(..))"*/)
    public void verify() {
    }

    @Before("verify()")
    public void doVerify() {
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
        log.info("this is aop doVerify()");

    }
}
