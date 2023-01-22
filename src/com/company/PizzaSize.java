package com.company;

public enum PizzaSize {
    SMALL(30), MEDIUM(40), LARGE(50);

    private int price;

    PizzaSize(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

