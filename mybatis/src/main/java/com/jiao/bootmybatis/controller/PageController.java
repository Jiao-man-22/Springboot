package com.jiao.bootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转Controller
 * */
@Controller
public class PageController {
    //页面跳转方法
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
    return  page;
    }
    @RequestMapping("/showPage")
    public String ShowPages(){
        return "ok";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}
