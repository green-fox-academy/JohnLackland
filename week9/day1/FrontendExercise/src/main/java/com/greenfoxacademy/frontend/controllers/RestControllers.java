package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.errors.ErrorMassage;
import com.greenfoxacademy.frontend.errors.GreetingError;
import com.greenfoxacademy.frontend.jsonmodells.ComplexJson;
import com.greenfoxacademy.frontend.jsonmodells.Until;
import com.greenfoxacademy.frontend.model.*;
import org.springframework.web.bind.annotation.*;

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
        if (name != null && title != null){
            Greeting greeting = new Greeting(name, title);
            return greeting;
        }else if (name == null && title != null){
            GreetingError error = new GreetingError("name");
            return error;
        } else if (name != null && title == null){
            GreetingError error = new GreetingError("title");
            return error;
        }else {
            return new GreetingError();
        }
    }

    @GetMapping("/appenda/{appendable}")
    public Object returnA(@PathVariable("appendable") String appendable){
        Appendables appendables = new Appendables(appendable);

        return appendable;
    }

    @PostMapping("/dountil/{action}")
    public Object until(@PathVariable("action")String action, @RequestBody Until until){
        UntilSomething something = new UntilSomething();
        something.calculateTheField(action, until);
        return something;
    }

    @PostMapping("/arrays")
    public Object arrayHandler(@RequestBody ComplexJson complexJson){
        if(complexJson.getWhat() == null){
            ErrorMassage errorMassage = new  ErrorMassage("Pls provide something");
            return errorMassage;
        }else {
            ArrayHandler arrayHandler = new ArrayHandler();
            arrayHandler.counting(complexJson);
            return arrayHandler;
        }


    }
}
