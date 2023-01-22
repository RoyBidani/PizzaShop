package com.company.Pizzas;

public abstract class Pizza {
    String string ;
    int cost;
    public Pizza(String string, int cost) {
        this.string = string;
        this.cost = cost;
    }
    public String getDescription() {
        return string + getCostString();
    }


    public int getCost() {
        return cost;
    }


    public String getCostString() {
        return "\nCost: "+cost;
    }


    public String getString() {
        return string;
    }

}
