package com.jiao.controller;

import org.springframework.http.HttpRequest;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *整合servlet方式一：基于注解
 */

@WebServlet(name = "TestServlet",urlPatterns = "/testservlet")
public class TestServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("TestServlet start");
    }

}
