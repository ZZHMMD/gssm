package com.demo.controller;

import com.demo.pojo.Result;
import com.demo.pojo.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class RegisterController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/resgister",method = RequestMethod.POST)
    public String registerUser(User user,Model model){
        Result result = userService.insertUser(user);
        model.addAttribute("message", result.getMessage());
        return "result";
    }

    @RequestMapping("/active")
    public String activeUser(int id,String code,Model model){
        Result result = userService.activeUser(id, code);
        model.addAttribute("message", result.getMessage());
        return "result";
    }


}
