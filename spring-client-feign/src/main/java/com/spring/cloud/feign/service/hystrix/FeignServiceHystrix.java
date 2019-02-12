package com.spring.cloud.feign.service.hystrix;

import com.spring.cloud.feign.service.FeignService;
import org.springframework.stereotype.Component;


/*
*Feign 自带熔断器，关闭的，需要在配置文件（application.yml）中配置打开它
* 创建熔断器类并实现对应的 Feign 接口
* */
@Component
public class FeignServiceHystrix implements FeignService{
    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
