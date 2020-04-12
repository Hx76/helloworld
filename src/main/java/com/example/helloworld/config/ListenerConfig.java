package com.example.helloworld.config;

import com.example.helloworld.listener.SecondLinster;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ListenerConfig {
    @Bean
    public ServletListenerRegistrationBean getServlet(){
        var bean = new ServletListenerRegistrationBean(new SecondLinster());
        return bean;
    }
}
