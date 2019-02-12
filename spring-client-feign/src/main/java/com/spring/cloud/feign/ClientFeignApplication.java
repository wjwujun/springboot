package com.spring.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
*@EnableFeignClients 注解开启 Feign 功能
*Feign 是一个声明式的伪 Http 客户端，Http 变得更简单。
* 有可插拔的注解特性，可使用 Feign 注解和 JAX-RS 注解,支持可插拔的编码器和解码器,集成了 Ribbon，并和 Eureka 结合，默认实现了负载均衡的效果
*
*
* @EnableHystrixDashboard  熔断器仪表盘监控
*       Ribbon 和 Feign ，两个项目的改造方式相同
* */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
public class ClientFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientFeignApplication.class, args);

    }
}
