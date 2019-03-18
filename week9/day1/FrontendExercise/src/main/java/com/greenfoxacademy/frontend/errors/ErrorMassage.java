package com.greenfoxacademy.frontend.errors;

public class ErrorMassage {

    private String error;

    public ErrorMassage(String input) {
        this.error = input;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
