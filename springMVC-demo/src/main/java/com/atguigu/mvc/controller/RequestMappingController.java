package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class RequestMappingController {

    @RequestMapping("/testRequestMapping")
    public String success(){
        return "success";
    }
}
