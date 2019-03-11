package com.greenfoxacademy.kariprac.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InhabitantList {
    private  List<Inhabitant> inhabitantList;

    public InhabitantList() {
        inhabitantList = new ArrayList<>();
        initializeList();
    }

    private void initializeList(){
        inhabitantList.add(new Inhabitant("Micimacko",323, Gender.MALE));
        inhabitantList.add(new Inhabitant("Malacka",33, Gender.FEMALE));
        inhabitantList.add(new Inhabitant("Tigris",22, Gender.FEMALE));
        inhabitantList.add(new Inhabitant("Robert Gida",15, Gender.FEMALE));
    }

    public  List<Inhabitant> getInhabitantList() {
        return inhabitantList;
    }

    public Inhabitant getSpecificInhabitant(int id){
        for (Inhabitant inhabitant : inhabitantList){
            if (inhabitant.getId() == id){
                return inhabitant;
            }
        }
        return null;
    }

    public void addNewInhabitant(Inhabitant inhabitant){
        inhabitantList.add(inhabitant);
    }
}
