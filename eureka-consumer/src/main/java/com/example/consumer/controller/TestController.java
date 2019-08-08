package com.example.consumer.controller;

import com.example.consumer.service.TestFeginServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestFeginServiceClient testService;

    /**
     * 普通Restful
     * @return
     */
    @RequestMapping(value = "/local", method = RequestMethod.GET)
    public String local() {
        return "本地local调用";

    }

    /**
     * 利用Fegin客户端实现RPC调用服务
     * @return
     */
    @RequestMapping(value = "/order/test", method = RequestMethod.GET)
    public String test(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return testService.test();
    }

}