package com.example.consumer.service;
import org.springframework.stereotype.Component;

//定义降级逻辑
@Component
public class FeignServiceFallBack implements TestFeginServiceClient {
    @Override
    public String test() {
        return "调用eureka-peer-client2中的test方法时，发生熔断，熔断位置位于服务的消费者访问服务的提供者处，由此触发了服务降级";
    }
}
