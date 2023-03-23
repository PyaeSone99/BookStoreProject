package com.example.springmvcurlmapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/","home"})
    public String sayHello(Model model){
        model.addAttribute("taglib","Hello Spring Mvc");
        return "home";
    }
    @GetMapping("/hello")
    public String saySpring(Model model){
        model.addAttribute("taglib","say Spring mvc");
        return "home";
    }
}
