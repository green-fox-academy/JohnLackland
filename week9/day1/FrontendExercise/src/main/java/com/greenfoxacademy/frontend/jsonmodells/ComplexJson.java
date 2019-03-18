package com.greenfoxacademy.frontend.jsonmodells;

public class ComplexJson {
    private String what;
    private int[] numbers;

    public ComplexJson(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public ComplexJson() {
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
