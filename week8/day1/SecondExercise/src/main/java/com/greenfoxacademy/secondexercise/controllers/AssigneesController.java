package com.greenfoxacademy.secondexercise.controllers;

import com.greenfoxacademy.secondexercise.models.Assigne;
import com.greenfoxacademy.secondexercise.sevices.AssigneesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/assignees/{id}/delete")
    public String deleteById(@PathVariable("id") Long id){
        service.delete(id);
        return "redirect:/todo/assignees";
    }

    @GetMapping("/assignees/edit/{id}")
    public String editById(Model model, @PathVariable("id") Long id){
        model.addAttribute("assignees", service.findAssignee(id));
        return "assignees/edit";
    }

    @PostMapping("/assignees/edit/{id}")
    public String editById(@PathVariable("id") Long id, @ModelAttribute("newAssigne") Assigne assigne){
        service.update(id,assigne);
        return "redirect:/todo/assignees";
    }
}
