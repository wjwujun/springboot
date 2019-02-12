package com.spring.cloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/*
* @EnableDiscoveryClient  服务消费者
* @EnableHystrix  熔断器
* @EnableHystrixDashboard  熔断器仪表盘监控
 *       Ribbon 和 Feign ，两个项目的改造方式相同
 * */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class ClientRibbonApplication {
    /*
    *
    * Spring cloud 有两种服务调用方式，
    * 一种是 ribbon + restTemplate，
    *   另一种是 feign。
    * ribbon + rest。
    *
    * */
    public static void main(String[] args) {
        SpringApplication.run(ClientRibbonApplication.class, args);
    }
}
