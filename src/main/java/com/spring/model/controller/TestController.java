package com.spring.model.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @ApiOperation("测试请求")
    @RequestMapping(value="test", method = RequestMethod.GET)
    public String getTotal(double money,int num){
        return "sucess";
    }
}