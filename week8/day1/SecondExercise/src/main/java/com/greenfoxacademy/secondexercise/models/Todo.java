package com.greenfoxacademy.secondexercise.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    private String title;
    private boolean urgent;
    private boolean done;


    @ManyToOne (cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST})
    private Assigne assigne;

    public Assigne getAssignee() {
        return assigne;
    }

    public void setAssignee(Assigne assignee) {
        this.assigne = assignee;
    }

    public Todo(){
        this.urgent = false;
        this.done = false;
    }

    public Todo(String title) {
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

    public Todo(String title,boolean done, boolean urgent) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
