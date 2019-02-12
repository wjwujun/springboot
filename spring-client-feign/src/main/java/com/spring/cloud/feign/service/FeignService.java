package com.spring.cloud.feign.service;

import com.spring.cloud.feign.service.hystrix.FeignServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
*
* @FeignClient("服务名") 指定调用服务
*    必须用接口实现
*
*    fallback = FeignServiceHystrix.class  Hystrix熔断类
*
* */
@FeignClient(value = "spring-cloud-service",fallback = FeignServiceHystrix.class)
@Component
public interface  FeignService {

    /*
    * 写服务端的请求路径
    * 带参数的时候必须用，@RequestParam
    * */
    @GetMapping("getPort")
    public String sayHi(@RequestParam(value = "message") String message);

}
