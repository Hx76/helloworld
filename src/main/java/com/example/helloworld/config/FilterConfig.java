package com.example.helloworld.config;

import com.example.helloworld.filter.SecondFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new SecondFilter());
        filterRegistrationBean.addUrlPatterns(new String[]{"*.do","*.jsp"});
        filterRegistrationBean.addUrlPatterns("/second");
        return filterRegistrationBean;
    }
}
