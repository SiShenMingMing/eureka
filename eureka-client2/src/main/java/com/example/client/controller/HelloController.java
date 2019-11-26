package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private int port;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String index(){
        return "Hello World!,端口："+port;
    }


    @Value("${server.port}")  // 从对应的配置中心找到文件并把属性注入到value值中
    private String value;

    @RequestMapping("/hello")
    public String hello() {
        return "hello," + value;
    }

}

