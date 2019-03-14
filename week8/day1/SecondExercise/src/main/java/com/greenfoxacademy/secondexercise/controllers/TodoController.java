package com.greenfoxacademy.secondexercise.controllers;

import com.greenfoxacademy.secondexercise.models.Todo;
import com.greenfoxacademy.secondexercise.repository.RepositoryInterface;
import com.greenfoxacademy.secondexercise.sevices.TodoService;
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

    private TodoService repository;

    @Autowired
    public TodoController(TodoService repository) {
        this.repository = repository;
    }


    @GetMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) String active,String text) {
        model.addAttribute("todos", repository.addNewTodo(active));
        model.addAttribute("search", text);
        return "todolist";
    }

    @GetMapping(value = {"/{id}/delete", "/list/{id}/delete"})
    public String deleteTodo(@PathVariable("id") Long id){
        repository.delete(id);
        return "redirect:/todo/";
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

    @GetMapping("/edit/{id}")
    public String getEdit(Model model,@PathVariable("id") Long id){
        model.addAttribute("todo",repository.find(id));
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public String updateTodo(@PathVariable("id") Long id,@ModelAttribute("todo") Todo todo){
        repository.update(id,todo);
        return "redirect:/todo/";
    }
}
