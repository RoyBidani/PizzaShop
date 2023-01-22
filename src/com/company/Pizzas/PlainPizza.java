package com.company.Pizzas;

import com.company.PizzaSize;

public class PlainPizza extends Pizza {
    public PlainPizza(PizzaSize size) {
        super(size+" Pizza:\n",size.getPrice());

    }

}
