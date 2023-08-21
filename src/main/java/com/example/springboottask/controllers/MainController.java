package com.example.springboottask.controllers;

import com.example.springboottask.entityes.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String getMainPage(Model model){
        model.addAttribute("user", new User());
        return "main";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

}
