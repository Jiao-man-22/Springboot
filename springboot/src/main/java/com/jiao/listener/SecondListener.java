package com.jiao.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SecondListener  implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("SecondListener...init...");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Second...destroy...");
    }
}
