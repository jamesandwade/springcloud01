package com.offcn.managersys.feignrpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "user-service",fallback = LocalItemService.class)
public interface FeignService {
    @GetMapping("/hello")
    public String demo();
}
