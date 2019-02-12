package com.spring.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    /*
     * 消费服务提供者的消息
     *@HystrixCommand(fallbackMethod = "hiError")  链接不上调用hiError
     * */
    @HystrixCommand(fallbackMethod = "hiError")
    public String getPort(String message) {

        return restTemplate.getForObject("http://spring-cloud-service/getPort?message=" + message, String.class);
    }

    /*
    * 错误返回
    *
    * */
    public String hiError(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
