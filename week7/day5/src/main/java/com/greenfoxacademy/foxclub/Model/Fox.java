package com.greenfoxacademy.foxclub.Model;


import java.util.ArrayList;
import java.util.List;

public class Fox {
    String name;
    List<String> listOfTricks;
    String food;
    String drink;

    public Fox(){

    }

    public Fox(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

}
