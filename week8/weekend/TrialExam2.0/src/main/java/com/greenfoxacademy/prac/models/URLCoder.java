package com.greenfoxacademy.prac.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;
@Entity
public class URLCoder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String URL;
    private String alias;
    private int hitCounter;
    private String randomNumber;

    public Long getLong() {
        return id;
    }

    public String  getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public URLCoder(String URL, String alias) {
        this.URL = URL;
        this.alias = alias;
        this.randomNumber = String.format("%04d", new Random().nextInt(10000));
    }

    public URLCoder() {
        this.randomNumber = String.format("%04d", new Random().nextInt(10000));
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getHitCounter() {
        return hitCounter;
    }

    public void setHitCounter(Integer hitCounter) {
        this.hitCounter = hitCounter;
    }
}
