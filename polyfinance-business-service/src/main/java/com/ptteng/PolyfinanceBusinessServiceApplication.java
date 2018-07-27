package com.ptteng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient//基于spring-cloud-netflix，服务提供者
@SpringBootApplication
@MapperScan(basePackages = "com.ptteng.dao")
public class PolyfinanceBusinessServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolyfinanceBusinessServiceApplication.class, args);
    }
}
