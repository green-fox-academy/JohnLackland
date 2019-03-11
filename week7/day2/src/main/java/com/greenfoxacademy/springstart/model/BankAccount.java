package com.greenfoxacademy.springstart.model;

public class BankAccount {
    private String name;
    private Double balance;
    private String animaltype;
    private Boolean king;
    private Boolean badGuy;

    public BankAccount(String name, Double balance, String animalType, Boolean king, Boolean badGuy) {
        this.name = name;
        this.balance = balance;
        this.animaltype = animalType;
        this.king = king;
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
        return king;
    }

    public Boolean getBadGuy() {
        return badGuy;
    }
}
