package com.greenfoxacademy.weekendtrial.models;




public class URLClass {
    private String url;
    private String alias;

    public URLClass() {
    }

    public URLClass(String url, String alias) {
        this.url = url;
        this.alias = alias;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
