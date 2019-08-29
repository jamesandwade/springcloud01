package com.offcn.managersys.controller;

import com.offcn.managersys.feignrpc.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {
    @Autowired
    private FeignService feignService;

    @GetMapping("/demo2")
    public String dataManger(){
        return feignService.demo();
    }
}
