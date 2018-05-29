package com.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InterceptorController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("testContoller");
        return "ok";
    }

}
