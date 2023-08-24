package com.example.springboottask.controllers;

import com.example.springboottask.entityes.User;
import com.example.springboottask.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MainController {

    UserService userService;
    @GetMapping("/")
    public String getMainPage(Model model){
        model.addAttribute("users", userService.getAll());
        return "main";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

}
