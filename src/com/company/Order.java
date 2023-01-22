package com.company;

import com.company.Pizzas.Pizza;
import com.company.Status.Pending;
import com.company.Status.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {
    String fname;
    String phone;
    String email;
    String address;
    int price;
    Status orderStatus;
    LocalDateTime orderDate;
    Pizza pizza;

    public Order(Client c, Pizza p){
        this.fname = c.getFname();
        this.phone = c.getPhoneNumber();
        this.email = c.getEmail();
        this.address = c.getAddress();
        this.price = p.getCost();
        this.orderStatus = new Pending();
        this.orderDate = LocalDateTime.now();
        this.pizza = p;
    }

    public String getFname() {
        return fname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getPrice() {
        return price;
    }

    public Status getOrderStatus() {
        return orderStatus;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setStatus(Status s){
        this.orderStatus = s;
    }


    @Override
    public String toString() {
       return "Order number: " +phone +"\n" +"Order Status: "+getOrderStatus()+"\n" +"Order Time:" +orderDate.format( DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) +"\n" +"Pizza: " + pizza.getDescription();
    }
}
