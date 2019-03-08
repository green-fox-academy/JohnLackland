package com.greenfoxacademy.foxclub.Model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxList {
    List<Fox> foxList;

    FoxList(){
        foxList = Arrays.asList(new Fox("Bence"),
                                new Fox("Szabi"),
                                new Fox("Zsofi"),
                                new Fox("Zoli"),
                                new Fox("Boti"),
                                new Fox("Laci"),
                                new Fox("Botond"));
    }

    public void addFox(Fox fox){
        foxList.add(fox);
    }

    public List<Fox> getFoxList() {
        return foxList;
    }

    public boolean isItIn(String name){
        if(foxList.stream().filter(p->p.name.toLowerCase().equals(name.toLowerCase())).collect(Collectors.toList()).size() == 0){
            return false;
        } else {
            return true;
        }

    }
}
