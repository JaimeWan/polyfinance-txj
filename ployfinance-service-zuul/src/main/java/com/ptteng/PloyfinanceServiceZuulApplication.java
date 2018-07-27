package com.ptteng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//开启zuul  @EnableZuulServer的增强版;
// 当Zuul与Eureka、Ribbon等组件配合使用时，我们使用@EnableZuulProxy。
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class PloyfinanceServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(PloyfinanceServiceZuulApplication.class, args);
    }
}
