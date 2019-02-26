package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    String contet;
    long id;

    public Greeting(String contet, long id) {
        this.contet = contet;
        this.id = id;
    }

    public String getContet() {
        return contet;
    }

    public long getId() {
        return id;
    }


}
