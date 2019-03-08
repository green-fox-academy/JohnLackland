package com.greenfoxacademy.foxclub.Controllers;

import com.greenfoxacademy.foxclub.Fox;
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
    List<Fox> foxList;

    MainController(){
        foxList = new ArrayList<>();
    }

    @GetMapping("/")
    public String getIndex(){
        return "/index";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam("name") String name){
        fox = new Fox(name);
        return "redirect:";
    }

}
