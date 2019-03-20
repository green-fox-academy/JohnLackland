package com.greenfoxacademy.weekendtrial.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String url;
    private String alias;
    private String secretCode;
    private int hitcount;

    public Link() {
        secretCode = "" + (int) (Math.random() * 10000);
        for (int j = 0; j < 4 - secretCode.length(); j++) {
            secretCode = "0" + secretCode;
        }
        hitcount = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public int getHitcount() {
        return hitcount;
    }

    public void setHitcount(int hitcount) {
        this.hitcount = hitcount;
    }
}
