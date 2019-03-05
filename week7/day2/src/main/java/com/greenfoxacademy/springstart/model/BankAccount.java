package com.greenfoxacademy.springstart.model;

public class BankAccount {
    private String name;
    private Double balance;
    private String animaltype;

    public BankAccount(String name, Double balance, String animaltype){
        this.name = name;
        this.balance = balance;
        this.animaltype = animaltype;

    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animaltype;
    }
}
