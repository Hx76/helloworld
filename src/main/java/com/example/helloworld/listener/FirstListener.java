package com.example.helloworld.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class FirstListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Linster ...Init......");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
