package com.greenfoxacademy.frontend.model;

public class UserInput {
    private int received;
    private int result;

    public UserInput(int input) {
        result = input * 2;
        received = input;
    }

    public int getReceived() {
        return received;
    }

    public int getResult() {
        return result;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
