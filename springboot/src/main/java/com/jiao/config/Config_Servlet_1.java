package com.jiao.config;

import com.jiao.controller.ConfigServlet;
import com.jiao.filter.TestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
使用配置类注册 整合servlet
*/
@Configuration
public class Config_Servlet_1 {
    /**
     * 完成Servlet组件注册
     * */
    @Bean
    public ServletRegistrationBean getServletConfigurationBean(){
        // 使用的ServletResgisterBean类  注册要启动的servlet
        ServletRegistrationBean bean=new ServletRegistrationBean(new ConfigServlet());
        bean.addUrlMappings("/testconfig");
        return  bean;
    };
    /*
    * 注册filter组件*/
    @Bean
    public FilterRegistrationBean getConfigationFilterBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new TestFilter());
        //传入数组
        //filterRegistrationBean.addUrlPatterns(new String[]{"",""});
        filterRegistrationBean.addUrlPatterns("/testconfig");
        return filterRegistrationBean;
    }

}
