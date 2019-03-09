package com.greenfoxacademy.springstart.model;

public class BankAccount {
    private String name;
    private Double balance;
    private String animaltype;
    private Boolean isKing;
    private Boolean badGuy;

    public BankAccount(String name, Double balance, String animalType, Boolean isKing, Boolean badGuy) {
        this.name = name;
        this.balance = balance;
        this.animaltype = animalType;
        this.isKing = isKing;
        this.badGuy = badGuy;
    }

    public void addThem() {
        if (getKing()) {
            balance += 100;
        } else {
            balance += 10;
        }
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

    public Boolean getKing() {
        return isKing;
    }

    public Boolean getBadGuy() {
        return badGuy;
    }
}
