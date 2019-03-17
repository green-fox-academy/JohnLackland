package com.greenfoxacademy.secondexercise.controllers;

import com.greenfoxacademy.secondexercise.models.Todo;
import com.greenfoxacademy.secondexercise.sevices.AssigneesService;
import com.greenfoxacademy.secondexercise.sevices.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService repository;
    private AssigneesService assigneesService;

    @Autowired
    public TodoController(TodoService repository, AssigneesService assigneesService) {
        this.repository = repository;
        this.assigneesService = assigneesService;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) String active) {
        model.addAttribute("todos", repository.addNewTodo(active));
        return "todo/todolist";
    }

    @PostMapping("/search")
    public String searchPost(Model model,@RequestParam(value = "find", required = false) String find){
        model.addAttribute("todos", repository.search(find));
        return "todo/todolist";
    }

    @GetMapping(value = {"/{id}/delete", "/list/{id}/delete"})
    public String deleteTodo(@PathVariable("id") Long id){
        repository.delete(id);
        return "redirect:/todo/";
    }

    @GetMapping("/add")
    public String addNewTodoGet(@ModelAttribute("newTodo") Todo newTodo){

        return "todo/addTodo";
    }

    @PostMapping("/add")
    public String addNewTodoLPost(@ModelAttribute("newTodo") Todo newTodo){
        repository.save(newTodo);
        return "redirect:/todo/";
    }

    @GetMapping("/edit/{id}")
    public String getEdit(Model model,@PathVariable("id") Long id){
        model.addAttribute("todo",repository.find(id));
        model.addAttribute("assigne", assigneesService.returnTheList());
        return "todo/edit";
    }

    @PostMapping("/edit/{id}")
    public String updateTodo(@PathVariable("id") Long id,@ModelAttribute("todo") Todo todo){
        repository.update(id,todo);
        return "redirect:/todo/";
    }
}
