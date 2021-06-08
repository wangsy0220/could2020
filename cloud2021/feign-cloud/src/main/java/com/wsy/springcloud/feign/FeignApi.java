package com.wsy.springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Component
@FeignClient(value= "CLOUD-PAYMENT-SERVICE")
public interface FeignApi {
    @GetMapping("/payment/get/{id}")
    String getId(@PathVariable("id") String id);
}
