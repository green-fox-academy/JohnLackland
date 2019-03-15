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
        if (!assignees.getName().isEmpty() && !assignees.getEmail().isEmpty()){
            assigneesRepository.save(assignees);
        }
    }

    public void delete(Long id){
        assigneesRepository.deleteById(id);
    }

    public Assigne find(Long id){
      return assigneesRepository.findById(id).orElse(null);
    }

    public void update(Long id, Assigne assigne){
        Assigne newAssigne = find(id);

        newAssigne.setName( assigne.getName());
        newAssigne.setEmail(assigne.getEmail());
        save(newAssigne);
    }
}
