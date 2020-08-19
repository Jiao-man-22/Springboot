package com.jiao.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class FirstListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("FirstListener...init...");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("FirstListener...destroy...");
    }
}
