package com.greenfoxacademy.secondexercise.controllers;

import com.greenfoxacademy.secondexercise.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/todo")
public class TodoController {

    private RepositoryInterface repository;

    @Autowired
    public TodoController(RepositoryInterface repository) {
        this.repository = repository;
    }


    @GetMapping(value = {"/", "/list"})
    public String list(Model model){
        model.addAttribute("todos", repository.findAll());
        return "todolist";
    }


}