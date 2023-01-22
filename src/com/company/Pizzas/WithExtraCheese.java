package com.company.Pizzas;

public class WithExtraCheese extends Pizza {
    public WithExtraCheese(Pizza pizza) {
        super(pizza.getString()+"With extra cheese\n", pizza.getCost()+5);
    }
}
