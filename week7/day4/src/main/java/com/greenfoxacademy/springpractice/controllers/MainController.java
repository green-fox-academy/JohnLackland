package com.greenfoxacademy.springpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/useful")
    public String getUsefull(){

        return "index";
    }
}
