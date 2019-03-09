package com.greenfoxacademy.foxclub.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FoxList {
    public List<Fox> foxList;

    public FoxList(){
        foxList = new ArrayList<>(Arrays.asList(new Fox("Bence"),
                                new Fox("Szabi"),
                                new Fox("Zsofi"),
                                new Fox("Zoli"),
                                new Fox("Boti"),
                                new Fox("Laci"),
                                new Fox("Botond")));
    }

    public void addFox(String name){
        foxList.add(new Fox(name));
    }

    public List<Fox> getFoxList() {
        return foxList;
    }

    public boolean isItIn(String name){
        if(foxList.stream()
                .filter(p->p.name.toLowerCase().equals(name.toLowerCase()))
                .collect(Collectors.toList()).size() == 0){
            return false;
        } else {
            return true;
        }

    }
}
