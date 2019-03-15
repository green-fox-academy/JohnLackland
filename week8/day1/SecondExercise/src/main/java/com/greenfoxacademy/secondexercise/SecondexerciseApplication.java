package com.greenfoxacademy.secondexercise;

import com.greenfoxacademy.secondexercise.models.Assigne;
import com.greenfoxacademy.secondexercise.models.Todo;
import com.greenfoxacademy.secondexercise.repository.AssigneesRepository;
import com.greenfoxacademy.secondexercise.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SecondexerciseApplication  implements CommandLineRunner{

    private RepositoryInterface todoRepository;
    private AssigneesRepository assigneeRepository;

    @Autowired
    public SecondexerciseApplication(RepositoryInterface todoRepository, AssigneesRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SecondexerciseApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Assigne a = new Assigne("Béla", "bela@gfd.hu");
        Assigne b = new Assigne("Gizi", "gizi@gmail.hu");
        Assigne c = new Assigne("Pista", "pista@freemail.hu");
        Assigne d = new Assigne("Endre", "endre@gfd.hu");

        assigneeRepository.save(a);
        assigneeRepository.save(b);
        assigneeRepository.save(c);
        assigneeRepository.save(d);


        Todo todo1 = new Todo("I have to understand everything", true, true);
        Todo todo2 = new Todo("I have to learn CommandLineRunner", true, false);
        Todo todo3 = new Todo("Repair the car", true, false);
        Todo todo4 = new Todo("I have to learn CommandLineRunner", false, true);
        todoRepository.save(todo1);
        todoRepository.save(todo2);
        todoRepository.save(todo3);
        todoRepository.save(todo4);
        List<Todo> x = new ArrayList<>();
        x.add(todo1);
        a.setTodo(x);
        assigneeRepository.save(a);
    }
}
