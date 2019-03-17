package com.greenfoxacademy.prac.services;

import com.greenfoxacademy.prac.models.URLCoder;
import com.greenfoxacademy.prac.repositorys.URLCoderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class URLCoderService {
    private URLCoderRepository repository;

    @Autowired
    public URLCoderService(URLCoderRepository repository) {
        this.repository = repository;
    }

    public void save(URLCoder url){
        repository.save(url);
    }

}
