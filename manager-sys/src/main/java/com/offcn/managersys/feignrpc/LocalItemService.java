package com.offcn.managersys.feignrpc;

import org.springframework.stereotype.Component;

@Component
public class LocalItemService implements FeignService{
    @Override
    public String demo() {
        return "远程服务熔断";
    }
}
