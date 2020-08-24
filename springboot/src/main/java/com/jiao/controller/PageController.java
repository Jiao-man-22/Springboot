package com.jiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageController {
    /*
    * 页面跳转
    * */
    @GetMapping("/{page}")
    public String showPage(@PathVariable  String page){
        return page;
    }
}
