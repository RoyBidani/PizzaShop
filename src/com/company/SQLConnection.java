package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnection {

    public static Connection getConnection() throws SQLException {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop","root","root1234")) {
            System.out.println("connected");
        }catch (SQLException e){


            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root1234");
            Statement statement = con.createStatement();
            System.out.println("logged");
            statement.execute("CREATE DATABASE pizzashop");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop","root","root1234");
            statement = con.createStatement();

            statement.execute("CREATE TABLE client_accounts(" +
                    "fname varchar(20) not null," +
                    "lname varchar(20) not null," +
                    "phone varchar(15) PRIMARY KEY not null," +
                    "email varchar(45) not null," +
                    "address varchar(45) not null);");


            statement.execute("CREATE TABLE logs(" +
                    "fname varchar(20) not null," +
                    "phone varchar(15) not null," +
                    "address varchar(45) not null," +
                    "price int not null," +
                    "order_status varchar(45) not null," +
                    "order_date DATETIME not null," +
                    "FOREIGN KEY(phone) REFERENCES client_accounts(phone));");

        }


        return DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop","root","root1234");
    }
}
