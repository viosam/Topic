package com.spring.boot.filter.filter.config;

import com.spring.boot.filter.filter.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfiguration {

    @Bean
    public FilterRegistrationBean testFilterRegistration() {
        // 新建过滤器注册类
        FilterRegistrationBean registration = new FilterRegistrationBean();
        // 添加自定义 过滤器
        registration.setFilter(myFilter());
        // 设置过滤器的URL模式
        registration.addUrlPatterns("/filter/*");
        //设置过滤器顺序
        registration.setOrder(1);
        return registration;
    }

    @Bean
    public MyFilter myFilter(){
        return new MyFilter();
    }
}
