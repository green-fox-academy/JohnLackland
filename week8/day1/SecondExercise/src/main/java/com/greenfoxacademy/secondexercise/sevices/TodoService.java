package com.greenfoxacademy.secondexercise.sevices;

import com.greenfoxacademy.secondexercise.models.Todo;
import com.greenfoxacademy.secondexercise.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {
    private RepositoryInterface repository;
    private List<Todo> listOfTodos;

    @Autowired
    public TodoService(RepositoryInterface repository) {
        this.repository = repository;
        listOfTodos = new ArrayList<>();
    }

    public Iterable<Todo> addNewTodo(String addThis){
        if(addThis == null){
            return repository.findAll();
        }
        if (!addThis.isEmpty() && addThis.equalsIgnoreCase("true")){
            repository.findAll().forEach(listOfTodos::add);
            return listOfTodos.stream().filter(p -> !p.isDone()).collect(Collectors.toList());
        } else {
           return repository.findAll();
        }
    }

    public void save(Todo newTodo){
        if(!newTodo.getTitle().isEmpty()) {
            repository.save(newTodo);
        }
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Todo find(Long id){
        return repository.findById(id).orElse(null);
    }

    public void update(Long id, Todo newTodo){
        Todo todo = find(id);

        todo.setTitle(newTodo.getTitle());
        todo.setDone(newTodo.isDone());
        todo.setUrgent(newTodo.isUrgent());

        save(todo);

    }


}
