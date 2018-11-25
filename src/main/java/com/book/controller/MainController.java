package com.book.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 一点点
 * @Date: 2018/11/24 22:14
 * @Version 1.0
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String root(){
      return "redirect:/index";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/user/index")
    public String userIndex(){
        return "user/index";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("loginError",true);
        return "login";
    }
    @GetMapping("/401")
    public String accessDenied(){
        return "401";
    }

}
