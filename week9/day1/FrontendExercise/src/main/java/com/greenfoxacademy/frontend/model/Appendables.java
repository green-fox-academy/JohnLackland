package com.greenfoxacademy.frontend.model;

public class Appendables {
    private String appendable;

    public Appendables(String appendable) {
        this.appendable = appendable + "a";
    }

    public String getAppendable() {
        return appendable;
    }

    public void setAppendable(String appendable) {
        this.appendable = appendable;
    }
}
