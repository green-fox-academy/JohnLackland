package com.greenfoxacademy.secondexercise.controllers;

import com.greenfoxacademy.secondexercise.models.Assigne;
import com.greenfoxacademy.secondexercise.sevices.AssigneesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class AssigneesController {

    private AssigneesService service;

    @Autowired
    public AssigneesController(AssigneesService service) {
        this.service = service;
    }

    @GetMapping("/assignees")
    public String getAssignees(Model model, @ModelAttribute("assign") Assigne assign){
        model.addAttribute("assignees", service.listOut());
        return "assignees/assignees";
    }

    @PostMapping("/addAssigne")
    public String addNew(@ModelAttribute("newAssign") Assigne newAssign){
        service.save(newAssign);
        return "redirect:/todo/assignees";
    }
}
