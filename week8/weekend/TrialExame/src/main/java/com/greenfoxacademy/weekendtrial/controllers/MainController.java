package com.greenfoxacademy.weekendtrial.controllers;

import com.greenfoxacademy.weekendtrial.models.URLClass;
import com.greenfoxacademy.weekendtrial.services.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private URLService service;

    @Autowired
    public MainController(URLService service) {
        this.service = service;
    }

    @GetMapping ("/")
    public String getmainPage(Model model,@ModelAttribute("urll") URLClass url){
        model.addAttribute("notContains", service.getNotContains());
        model.addAttribute("errorURL", service.getErrorURL());

        return "main_page";
    }

    @PostMapping("/save_link")
    public String saveUrl(@ModelAttribute("url") URLClass url){
        service.isContains(url);
        return "redirect:/";
    }
}
