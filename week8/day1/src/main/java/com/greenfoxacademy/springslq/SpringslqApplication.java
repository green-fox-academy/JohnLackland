package com.greenfoxacademy.springslq;

import com.greenfoxacademy.springslq.modells.Todo;
import com.greenfoxacademy.springslq.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringslqApplication implements CommandLineRunner {
    private RepositoryInterface repository;

    @Autowired
    public SpringslqApplication(RepositoryInterface repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringslqApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Todo("I have to learn Object Relational Mapping"));
    }


}
