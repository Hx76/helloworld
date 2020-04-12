package com.example.helloworld.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SecondLinster implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Second...Listener...init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
