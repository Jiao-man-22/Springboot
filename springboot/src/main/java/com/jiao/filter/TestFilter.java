package com.jiao.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 *整合filter
 * urlPatterns 可以拦截数组 urlPatterns = {”*.do“，”*.jsp“，”*.html“}
 */
@WebFilter(filterName = "testfilter",urlPatterns = "/testservlet")
public class TestFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入filter...");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开filter...");
    }

    @Override
    public void destroy() {

    }
}
