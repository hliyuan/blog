package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2017/7/21.
 */
@RestController
public class TestController {
    @RequestMapping(name="/")
    public String index(){
        return "lalalallalallalal";
    }
}
