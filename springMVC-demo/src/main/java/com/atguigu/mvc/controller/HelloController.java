package com.atguigu.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping("/target")
    public String target(){
        System.out.println("aaaaa");
        System.out.println("aaaaa");
        System.out.println("bbbbb");
        System.out.println("ddddd");
        System.out.println("eeeee");
     return "target";
    }


}
