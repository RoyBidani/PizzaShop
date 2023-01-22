package com.company;

import com.company.Pizzas.Pizza;
import com.company.Pizzas.PlainPizza;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        WorkerClass ws = new WorkerClass();
        PizzaManagment.order();
        ws.main();




    }
}
