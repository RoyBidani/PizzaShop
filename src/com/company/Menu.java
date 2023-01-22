package com.company;

import com.company.Pizzas.*;
import com.company.ScannerGetter;

public class Menu {

    public static Pizza Menu(){
        final int MAX_TOPPINGS = 5;
        System.out.println("Welcome to Pizza Puzza!");
        System.out.println("Please select your pizza size:");
        System.out.println("[1] - Small \n[2] - Medium \n[3] -  Large");
        int size = ScannerGetter.scanInt();
        Pizza p =  switch (size){
            case 1 -> new PlainPizza(PizzaSize.SMALL);
            case 2 -> new PlainPizza(PizzaSize.MEDIUM);
            case 3 -> new PlainPizza(PizzaSize.LARGE);
            default -> throw new IllegalArgumentException("Invalid size");

        };
        int pickingsCount = 0;
        while (pickingsCount < MAX_TOPPINGS ){
            System.out.println("Please select your topping:");
            System.out.println("[1] - ExtraCheese \n[2] - olives \n[3] - tomato \n [9] - finish");
            int topping = ScannerGetter.scanInt();
            switch (topping){
                case 1 -> {pickingsCount++;p = new WithExtraCheese(p);}
                case 2 -> {pickingsCount++;p = new WithOlives(p);}
                case 3 -> {pickingsCount++;p = new WithTomato(p);}
                case 9 -> {return p;}
            }
        }

        return p;
    }
}
