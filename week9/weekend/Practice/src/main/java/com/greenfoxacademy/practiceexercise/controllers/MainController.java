package com.greenfoxacademy.practiceexercise.controllers;

import com.greenfoxacademy.practiceexercise.models.User;
import com.greenfoxacademy.practiceexercise.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getIndex(Model model, @ModelAttribute("newUser") User newUser){
        model.addAttribute("userList", userService.getUserList());
        model.addAttribute("erromessage", userService.getErrorMessage());
        model.addAttribute("isSomethingWentWrong", userService.isSomethingWentWrong());
        return "index";
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute("newUser") User newUser){
        userService.saveUser(newUser);
        return "redirect:/";
    }
}
