package com.greenfoxacademy.frontend.services;

import com.greenfoxacademy.frontend.model.Log;
import com.greenfoxacademy.frontend.repositorys.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogService {
    private LogRepository repository;
    @Autowired
    public LogService(LogRepository repository) {
        this.repository = repository;
    }

    public List<Log> returnDatabase(){
        List<Log> test = new ArrayList<>();
        repository.findAll().forEach(test::add);
        return test;
    }

    public void saveLog(String data, String endpoint){
        Log log = new Log(endpoint, data);
        repository.save(log);
    }


}
