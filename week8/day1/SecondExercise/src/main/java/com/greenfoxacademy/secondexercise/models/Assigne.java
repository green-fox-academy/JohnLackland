package com.greenfoxacademy.secondexercise.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assigne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String name;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "assignee")
    private List<Todo> todos;

    public Assigne() {
    }

    public Assigne(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Todo> getTodo() {
        return todos;
    }

    public void setTodo(List<Todo> todo) {
        this.todos = todo;
    }
}
