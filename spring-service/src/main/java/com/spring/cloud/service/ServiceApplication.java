package com.spring.cloud.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*
*@EnableEurekaClient   注册到服务中心
* */
@SpringBootApplication
@EnableEurekaClient
public class ServiceApplication {
    /*
    * 服务提供者
    *
    * */
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class,args);
    }
}
