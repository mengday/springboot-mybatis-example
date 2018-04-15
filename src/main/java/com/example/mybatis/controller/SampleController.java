package com.example.mybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mengday.zhang on 2018/4/15.
 */
@RestController
public class SampleController {

    @RequestMapping("/hello")
    public String jenkins(){
        return "hello jenkins";
    }
}
