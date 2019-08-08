package com.example.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * 当调用eureka-peer-client2中的test接口时，如果发生了熔断，会调用FeignServiceFallBack中指定的降级逻辑
 * 将会触发降级
 */
@FeignClient(name = "eureka-peer-client2",fallback = FeignServiceFallBack.class)
public interface TestFeginServiceClient {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test();
}