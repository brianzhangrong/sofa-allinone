package com.ihomefnt.ark.allinone.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.ihomefnt.ark.inter.Demo1Interface;
import com.ihomefnt.ark.inter.Demo2Interface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @SofaReference
    private Demo2Interface demo2Interface;
    @SofaReference
    private Demo1Interface demo1Interface;
    @GetMapping("test")
    public String test(){
//        new com.ihomefnt.ark.demo.Demo1Service().init();
        return demo2Interface.init()+"--->"+demo1Interface.demo1();
    }

}
