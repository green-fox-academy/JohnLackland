package com.greenfoxacademy.springslq.controllers;

import com.greenfoxacademy.springslq.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
