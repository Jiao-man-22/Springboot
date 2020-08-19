package com.jiao.config;

import com.jiao.listener.SecondListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/***
 * listener 的配置类
 *
 */
public class ListenerConfig {
    @Bean
    public ServletListenerRegistrationBean getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean(new SecondListener());
        return servletListenerRegistrationBean;
    }
}
