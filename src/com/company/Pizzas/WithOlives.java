package com.company.Pizzas;

public class WithOlives extends Pizza {
    public WithOlives(Pizza pizza) {
        super(pizza.getString()+"With Olives\n", pizza.getCost()+5);
    }
}
