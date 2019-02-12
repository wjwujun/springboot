package com.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*
*@EnableConfigServer        开启配置服务器功能
*
* 配置服务器的默认端口为 8888，如果修改了默认端口，则客户端项目就不能在 application.yml 或 application.properties 中配置 spring.cloud.config.uri，必须在 bootstrap.yml 或是 bootstrap.properties 中配置，原因是 bootstrap 开头的配置文件会被优先加载和配置，切记。
*
* 生产环境运行 java -jar hello-spring-cloud-web-admin-feign-1.0.0-SNAPSHOT.jar --spring.profiles.active=prod
*
* */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }
}
