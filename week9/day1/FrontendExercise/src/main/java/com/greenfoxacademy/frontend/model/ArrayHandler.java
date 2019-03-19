package com.greenfoxacademy.frontend.model;

import com.greenfoxacademy.frontend.jsonmodells.ComplexJson;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;

public class ArrayHandler {

    private Object result;

    public void counting(ComplexJson json){
        if (json.getWhat().equals("sum")){
            result = Arrays.stream(json.getNumbers()).sum();

        } else  if(json.getWhat().equals("multiply")){
            int help = 1;
            for (int i:json.getNumbers()) {
                help *= i;
            }
            result = help;

        } else {
            result = Arrays.stream(json.getNumbers())
                    .map(p -> p * 2).toArray();
        }
    }

    public Object getResult() {
        return result;
    }
}
