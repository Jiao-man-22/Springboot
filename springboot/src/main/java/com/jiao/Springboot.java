package com.jiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan//启动时自动扫描servlet
public class Springboot{
    public static void main(String[] args) {
        SpringApplication.run(Springboot.class,args);
    }
}
