package com.company;

import com.company.Pizzas.Pizza;
import com.company.SQL.ToSql;
import com.company.ScannerGetter;

import java.sql.SQLException;

public class PizzaManagment {

    public static void order() throws SQLException {
        System.out.println("Enter phone number");
        String phoneNumber = ScannerGetter.scanString();
        Client c = new Client(phoneNumber);
        if (!c.exist())
            c = createAccount(phoneNumber);
        System.out.println("How many Pizzas would you like to order?");
        int numPizzas = ScannerGetter.scanInt();
        CreatePizzas(c, numPizzas);
    }


    public static void CreatePizzas(Client c,int numPizzas) throws SQLException {
        for (int i = 0; i < numPizzas; i++) {
            Pizza p = Menu.Menu();
            Order o = new Order(c, p);
            ToSql.createOrder(o);
        }
    }
    public static Client createAccount(String phoneNumber) throws SQLException {
        Client c = new Client();
        c.setPhoneNumber(phoneNumber);
        System.out.println("Enter name");
        c.setFname(ScannerGetter.scanString());
        System.out.println("Enter last name");
        c.setLname(ScannerGetter.scanString());
        System.out.println("Enter address");
        c.setAddress(ScannerGetter.scanString());
        System.out.println("Enter email");
        c.setEmail(ScannerGetter.scanString());

        ToSql.createClient(c);
        return c;
    }
}
