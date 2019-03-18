package com.greenfoxacademy.frontend.errors;

public class GreetingError {

    private String error;

    public GreetingError() {
        error = "Please provide a name and a title!";
    }

    public GreetingError(String error) {
        this.error = "Please provide a " + error + "!";
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
