package com.ptteng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients //开启Feign
@SpringBootApplication
public class PolyfinanceAdminWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolyfinanceAdminWebApplication.class, args);
    }
}
