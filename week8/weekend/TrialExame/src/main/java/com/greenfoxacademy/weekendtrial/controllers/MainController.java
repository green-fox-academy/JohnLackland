package com.greenfoxacademy.weekendtrial.controllers;

import com.greenfoxacademy.weekendtrial.models.Link;
import com.greenfoxacademy.weekendtrial.services.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private URLService service;

    @Autowired
    public MainController(URLService service) {
        this.service = service;
    }

    @GetMapping ("/")
    public String getMainPage(Model model,@ModelAttribute("urll") Link url){
        model.addAttribute("notContains",service.getNotContains());
        model.addAttribute("errorURL", service.getErrorURL());

        return "main_page";
    }

    @PostMapping("/save_link")
    public String saveUrl(@ModelAttribute Link link){
        service.isContains(link);
        return "redirect:/";
    }

    @GetMapping("/a/{alias}")
    public Object loadTheLink(@PathVariable(value = "alias", required = false) String text){
        if (service.findByAlias(text) != null){
            Link link = service.findByAlias(text);
            service.findByAlias(text).setAlias(link.getAlias() + 1);
            return "redirect:" + service.findByAlias(text).getUrl();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
