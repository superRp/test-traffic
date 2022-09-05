package com.rp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAccessController {

    @GetMapping
    public String test(){
        return "访问成功";
    }
}
