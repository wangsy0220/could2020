package com.wsy.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wsy.springcloud.feign.FeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignApi feignApi;
    @GetMapping("/payment/get/{id}")
    public String getId(@PathVariable String id){
        return feignApi.getId(id);
    }
}
