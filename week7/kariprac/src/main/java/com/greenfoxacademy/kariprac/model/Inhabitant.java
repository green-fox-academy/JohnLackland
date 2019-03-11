package com.greenfoxacademy.kariprac.model;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Inhabitant {

    private static int nextId = 1;

    private int id;
    private String name;
    private Integer age;
    private Gender Gender;

    public Inhabitant(String name, Integer age, com.greenfoxacademy.kariprac.model.Gender gender) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
        Gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public com.greenfoxacademy.kariprac.model.Gender getGender() {
        return Gender;
    }
}
