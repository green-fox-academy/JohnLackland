package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRestController{
    static AtomicLong id = new AtomicLong(0);

    @RequestMapping(value="/greeting")
    @ResponseBody
    public static Greeting greeting(@RequestParam("name") String name){

        return new  Greeting("Hello " + name, id.incrementAndGet());
    }
}
