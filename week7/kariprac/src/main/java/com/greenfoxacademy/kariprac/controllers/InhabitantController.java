package com.greenfoxacademy.kariprac.controllers;

import com.greenfoxacademy.kariprac.model.Gender;
import com.greenfoxacademy.kariprac.model.Inhabitant;
import com.greenfoxacademy.kariprac.model.InhabitantList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class InhabitantController {
    private InhabitantList inhabitantList;

    @Autowired
    public InhabitantController(InhabitantList inhabitantList) {
        this.inhabitantList = inhabitantList;
    }

    @GetMapping("/")
    public String getMainPage(){
        return "index";
    }

    @GetMapping("table")
    public String showInhabitant(Model model){
        model.addAttribute("inhabitants", inhabitantList.getInhabitantList());
        return "inhabitant_table";
    }

    @GetMapping("/inhabitants/{id}")
    public String getSpecificInhabitant(@PathVariable int id,Model model){
        Inhabitant inhabitant = inhabitantList.getSpecificInhabitant(id);
        model.addAttribute("inhabitant", inhabitant);
        return "special";
    }

    @GetMapping("/inhabitants/add")
    public String getAddingPage(Model model, @ModelAttribute("inhabitant") Inhabitant inhabitant){
        model.addAttribute("genders", Gender.values());
        return "addpage";
    }

    @PostMapping("/inhabitants/add")
    public String postAddingPage( Inhabitant inhabitant){
        inhabitantList.addNewInhabitant(inhabitant);
        return "redirect:/table";
    }

}
