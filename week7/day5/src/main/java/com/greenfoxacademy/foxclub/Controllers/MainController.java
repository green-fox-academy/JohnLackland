package com.greenfoxacademy.foxclub.Controllers;

import com.greenfoxacademy.foxclub.Model.Fox;
import com.greenfoxacademy.foxclub.Model.FoxList;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    Fox fox;
    FoxList foxList;

    @Autowired
    MainController(FoxList foxList){
        this.foxList = foxList;
    }

    @GetMapping("/")
    public String getIndexPage(Model model, @RequestParam( required = false, defaultValue = "Fox") String name) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(Model model, String name){
        if (name.equals("")){
            return "redirect:/login";
        } else if(foxList.isItIn(name)){
            return "redirect:/?name=" + name;
        }else{
            if (!foxList.isItIn(name))
            model.addAttribute("isItIn", true);
            return "login";
        }
    }

}
