package com.example.gateway;

import com.example.gateway.resolver.UriKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
    @Bean
/*    public HostAddKeyResolver hostAddKeyResolver(){
        return new HostAddKeyResolver();
    }*/
/*    public IpKeyResolver ipKeyResolver(){
        return new IpKeyResolver();
    }*/
    public UriKeyResolver uriKeyResolver() {
        return new UriKeyResolver();
    }
}
