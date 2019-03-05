package com.greenfoxacademy.springstart.models;

public class ShopItems {
    private String name;
    private String description;
    private int price;
    private int quantity;

   public ShopItems(String name, String desc, int price, int qualyti){
        this.description = desc;
        this.name = name;
        this.price = price;
        this.quantity = qualyti;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
