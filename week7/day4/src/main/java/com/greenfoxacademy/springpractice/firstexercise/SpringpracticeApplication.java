package com.greenfoxacademy.springpractice.firstexercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringpracticeApplication implements CommandLineRunner {
    private MyColor myColor;

    @Autowired
    SpringpracticeApplication(@Qualifier("Red") MyColor myColor){
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringpracticeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myColor.printColor();
    }
}
