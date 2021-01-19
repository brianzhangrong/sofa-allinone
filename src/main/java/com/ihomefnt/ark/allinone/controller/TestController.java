package com.ihomefnt.ark.allinone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test")
    public String test(){
//        new com.ihomefnt.ark.demo.Demo1Service().init();
        return "test";
    }

}
