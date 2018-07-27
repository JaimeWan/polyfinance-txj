package com.ptteng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients //开启Feign的功能
@SpringBootApplication
public class PolyfinanceHomeWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolyfinanceHomeWebApplication.class, args);
    }
}
