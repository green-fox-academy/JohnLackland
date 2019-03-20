package com.greenfoxacademy.weekendtrial.controllers;

import com.greenfoxacademy.weekendtrial.jsonobjects.DeleteById;
import com.greenfoxacademy.weekendtrial.services.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestControllers {
    @Autowired
    URLService service;

    @GetMapping("/api/links")
    public Object linkApis(){
        return service.returnTheRepoInList();
    }

    @DeleteMapping("/api/links/{id}")
    public Object deleteLink(@PathVariable(value = "id", required = false) Integer id, @RequestBody DeleteById delete){
        if(id == null || service.findById(id) == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }else if(delete != null || !service.findById(id).getSecretCode().equals(delete.getSecretCode())){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);

        } else {
            service.findTheSecretCodeAndDeleteTheLink(id,delete.getSecretCode());
            return delete;
        }

    }
}
