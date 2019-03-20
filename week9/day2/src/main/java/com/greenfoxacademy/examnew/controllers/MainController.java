package com.greenfoxacademy.examnew.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getIndex(){

        return "index";
    }

    @PostMapping("save-link")
    public String saveLink(){

    }

    @GetMapping("/a/{alias}")
    public String getAlias(){

    }

    @GetMapping("/api/links")
    public String getApiLinks(){

    }



}
