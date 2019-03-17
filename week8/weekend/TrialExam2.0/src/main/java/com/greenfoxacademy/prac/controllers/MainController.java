package com.greenfoxacademy.prac.controllers;

import com.greenfoxacademy.prac.models.URLCoder;
import com.greenfoxacademy.prac.services.URLCoderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private URLCoderService service;

    @Autowired
    public MainController(URLCoderService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getMainPage(Model model){
        model.addAttribute("newUrl", new URLCoder());
        return "main";
    }

    @PostMapping("/save-link")
    public String postNewUrl(@ModelAttribute("newUrl") URLCoder newUrl){
        service.save(newUrl);
        return "redirect:/";
    }
}
