package com.greenfoxacademy.springpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class thirdExerciseController {

    public String getGFA(Model model){

        return "index";
    }
}
