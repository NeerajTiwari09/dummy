package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(value = "/index/{param}")
    public String getHomepage(@PathVariable String param, Model model){
        model.addAttribute("status",(param!=null ? "Starting MvcApplication" : "default"));
        return "index.html";
    }
    @RequestMapping(value = "/home")
    public String getHomepageJsp(Model model){
        return "home.jsp";
    }
}
