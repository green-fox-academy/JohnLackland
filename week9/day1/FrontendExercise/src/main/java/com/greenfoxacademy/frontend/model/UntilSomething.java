package com.greenfoxacademy.frontend.model;

import com.greenfoxacademy.frontend.jsonmodells.Until;

public class UntilSomething {

    private int result;

    public void calculateTheField(String action, Until until){
        result = until.getUntil();
        if (action.equals("sum")){
            for (int i = 1; i < until.getUntil(); i++) {
                result += i;
            }
        } else {
            for (int i = 1; i < until.getUntil(); i++) {
                result *= i;
            }
        }
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
