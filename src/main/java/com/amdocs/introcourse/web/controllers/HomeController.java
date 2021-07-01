package com.amdocs.introcourse.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public class HomeController {
    @GetMapping
    public String home(){
        return "index";
    }

    @GetMapping("register")
    public String register(){
        return "register";
    }

    @GetMapping("contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("feedback")
    public String feedback(){
        return "feedback";
    }

    @GetMapping("course")
    public String course(){
        return "course";
    }

}