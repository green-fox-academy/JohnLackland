package com.greenfoxacademy.secondexercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class AssigneesController {

    @GetMapping("/assignees")
    public String getAssignees(){

        return "assignees";
    }

}
