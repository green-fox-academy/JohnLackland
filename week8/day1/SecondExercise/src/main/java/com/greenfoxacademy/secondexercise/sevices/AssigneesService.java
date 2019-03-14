package com.greenfoxacademy.secondexercise.sevices;

import com.greenfoxacademy.secondexercise.models.Assigne;
import com.greenfoxacademy.secondexercise.repository.AssigneesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneesService {
    private AssigneesRepository assigneesRepository;

    @Autowired
    public AssigneesService(AssigneesRepository repository) {
        this.assigneesRepository = repository;
    }

    public Iterable<Assigne> listOut(){
        return assigneesRepository.findAll();
    }

    public void save(Assigne assignees){
        assigneesRepository.save(assignees);
    }
}
