package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.errors.ErrorMassage;
import com.greenfoxacademy.frontend.model.Greeting;
import com.greenfoxacademy.frontend.model.UserInput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

    @GetMapping("/doubling")
    public Object valami(@RequestParam(value = "input", required = false) Integer input){

        if (input == null){
            ErrorMassage massage = new ErrorMassage("Please provide an input!");
            return massage;
        }else {
            UserInput object = new UserInput(input);
            return object;
        }
    }

    @GetMapping("/greeter")
    public Object greeter(@RequestParam(value = "name",required = false) String name, @RequestParam(value = "title", required = false) String title){
        Greeting greeting = new Greeting(name, title);

        return greeting;

    }
}
