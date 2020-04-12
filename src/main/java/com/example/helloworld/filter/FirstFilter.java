package com.example.helloworld.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter(filterName = "FirstFilter",urlPatterns = {"/first"})
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入first filter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开first filter");
    }

    @Override
    public void destroy() {

    }
}
