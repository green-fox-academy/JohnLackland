package com.greenfoxacademy.springpractice.controllers;

import com.greenfoxacademy.springpractice.models.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private UtilityService service;

    @Autowired
    MainController(UtilityService utilityService){
        this.service = utilityService;
    }

    @GetMapping("/useful")
    public String getUseful(){

        return "index";
    }

    @GetMapping("/useful/random")
    public String getUsefulRandom(Model model){
        model.addAttribute("randomColor", service.randomColor());
        return "randomColor";
    }

    @GetMapping("/useful/email")
    public String getEmail(Model model, @RequestParam("email") String email){
        model.addAttribute("isItValid", service.validateEmail(email));
        model.addAttribute("email",email);
        return "usefullEmail";
    }
    @GetMapping("/useful/encode")
    public String encode(Model model,@RequestParam("text") String text,@RequestParam("number") int number){
        model.addAttribute("encode", service.caesar(text,number));
        return "decode";
    }

    @GetMapping("/useful/decode")
    public String decode(Model model,@RequestParam("text") String text,@RequestParam("number") int number){
        model.addAttribute("encode", service.caesar(text,number*(-1)));
        return "encode";
    }

}
