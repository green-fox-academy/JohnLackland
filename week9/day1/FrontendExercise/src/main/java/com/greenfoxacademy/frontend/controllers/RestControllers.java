package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.errors.ErrorMassage;
import com.greenfoxacademy.frontend.errors.GreetingError;
import com.greenfoxacademy.frontend.jsonmodells.ComplexJson;
import com.greenfoxacademy.frontend.jsonmodells.Until;
import com.greenfoxacademy.frontend.model.*;
import com.greenfoxacademy.frontend.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RestControllers {

    private LogService service;

    @Autowired
    public RestControllers(LogService service) {
        this.service = service;
    }

    @GetMapping("/doubling")
    public Object valami(@RequestParam(value = "input", required = false) Integer input){

        if (input == null){
            ErrorMassage massage = new ErrorMassage("Please provide an input!");
            return massage;
        }else {
            service.saveLog("input=" + input, "/doubling");
            UserInput object = new UserInput(input);
            return object;
        }
    }

    @GetMapping("/greeter")
    public Object greeter(@RequestParam(value = "name",required = false) String name, @RequestParam(value = "title", required = false) String title){
        if (name != null && title != null){
            service.saveLog("name=" + name + ",title=" + title, "/greeter");
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
        service.saveLog("appendable=" + appendable, "/appenda/{appendable}");
        return appendables;
    }

    @PostMapping("/dountil/{action}")
    public Object until(@PathVariable("action")String action, @RequestBody(required = false) Until until){
        if(until == null){
            GreetingError error = new GreetingError("number");
            return error;
        }else {
            service.saveLog("action=" + action, "/dountil/{action}");
            UntilSomething something = new UntilSomething();
            something.calculateTheField(action, until);
            return something;
        }

    }

    @PostMapping("/arrays")
    public Object arrayHandler(@RequestBody(required = false) ComplexJson complexJson){
        if(complexJson == null){
            GreetingError errorMassage = new GreetingError("object");
            return errorMassage;
        }else {
            service.saveLog("numbers=" + Arrays.toString(complexJson.getNumbers()) +",what=" + complexJson.getWhat(), "/dountil/{action}");
            ArrayHandler arrayHandler = new ArrayHandler();
            arrayHandler.counting(complexJson);
            return arrayHandler;
        }
    }

    @GetMapping("/log")
    public Object log(){
        Map<String, Object> returnThis = new HashMap<>();
        returnThis.put("Entries", service.returnDatabase());
        returnThis.put("Entry_Counter", service.returnDatabase().size());
        return returnThis;
    }
}
