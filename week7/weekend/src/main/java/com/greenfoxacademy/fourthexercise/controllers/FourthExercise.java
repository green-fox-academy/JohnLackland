package com.greenfoxacademy.fourthexercise.controllers;

import com.greenfoxacademy.fourthexercise.models.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FourthExercise {
    StudentService service;

    @Autowired
    FourthExercise(StudentService service){
        this.service = service;
    }

    @GetMapping("/gfa")
    public String getIndex(){
        return "fourthIndex";
    }

    @GetMapping("/gfa/list")
    public String getListPage(Model model){
        model.addAttribute("gfaList",service.findAll());
        return "gfaList";
    }
    @GetMapping("gfa/add")
    public String addStudent(){
        return "addStudent";
    }
    @PostMapping("gfa/add")
    public String addStudent(@ModelAttribute("string")String student){
        service.save(student);
        return "addStudent";
    }
}
