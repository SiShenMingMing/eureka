package com.example.gateway.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController{

    @RequestMapping("fallback")
    public String fallback(){
        return "gateway到consumer发生熔断";
    }
}

