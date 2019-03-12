package com.greenfoxacademy.secondexercise.controllers;

import com.greenfoxacademy.secondexercise.models.Todo;
import com.greenfoxacademy.secondexercise.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/todo")
public class TodoController {

    private RepositoryInterface repository;

    @Autowired
    public TodoController(RepositoryInterface repository) {
        this.repository = repository;
    }


    @GetMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) String active) {
        List<Todo> todoList = new ArrayList<>();
        if (active != null && active.equalsIgnoreCase("true")) {
            repository.findAll().forEach(todoList::add);
            model.addAttribute("todos", todoList.stream().filter(p -> !p.isDone()).collect(Collectors.toList()));
        } else {
            model.addAttribute("todos", repository.findAll());
        }
        return "todolist";
    }

    @GetMapping("/add")
    public String addNewTodoGet(@ModelAttribute("newTodo") Todo newTodo){
        return "addTodo";
    }

    @PostMapping("/add")
    public String addNewTodoLPost(@ModelAttribute("newTodo") Todo newTodo){
        repository.save(newTodo);
        return "redirect:/todo/";
    }

}
