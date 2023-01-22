package com.company.Pizzas;

public class WithTomato extends Pizza {
    public WithTomato(Pizza pizza) {
        super(pizza.getString()+"With Tomato\n", pizza.getCost()+5);
    }
}
