package com.example.coffeeapplication.model;

public class CoffeeModel {

    private String coffeeName;
    private String milkType;
    private double coffeePrice;


    public CoffeeModel(String coffeeName, String milkType, double coffeePrice) {
        this.coffeeName = coffeeName;
        this.milkType = milkType;
        this.coffeeName = coffeeName;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public String getMilkType() {
        return milkType;
    }

    public double getCoffeePrice() {
        return coffeePrice;
    }
}
