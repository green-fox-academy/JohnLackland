package com.greenfoxacademy.secondexercise;

import com.greenfoxacademy.secondexercise.models.Todo;
import com.greenfoxacademy.secondexercise.repository.RepositoryInterface;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondexerciseApplication implements CommandLineRunner {

    private RepositoryInterface repositoryInterface;

    public SecondexerciseApplication(RepositoryInterface repositoryInterface) {
        this.repositoryInterface = repositoryInterface;
    }

    public static void main(String[] args) {
        SpringApplication.run(SecondexerciseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       repositoryInterface.save(new Todo("sgsd",false,true));
        repositoryInterface.save(new Todo("sgfffsd",true,true));
        repositoryInterface.save(new Todo("gadsg",false,true));
        repositoryInterface.save(new Todo("agdfh,ljkh",true,true));
    }
}
