package com.company.SQL;

import com.company.*;
import com.company.Status.Status;

import java.sql.SQLException;
import java.sql.Statement;

public class ToSql {

    public static void createClient(Client c) throws SQLException {
        Statement stmt = SQLConnection.getConnection().createStatement();
        stmt.execute("INSERT INTO client_accounts (fname,lname,phone,email,address) " +
                "VALUES ('" + c.getFname() + "','" + c.getLname() + "','" + c.getPhoneNumber() + "','" + c.getEmail() +
                "','" + c.getAddress() + "')");
    }

    public static void createOrder(Order o) throws SQLException {
        Statement stmt = SQLConnection.getConnection().createStatement();
        stmt.execute("INSERT INTO logs (fname,phone,address,price,order_status,order_date) " +
                "VALUES ('" + o.getFname() + "','" + o.getPhone() + "','" + o.getAddress() + "','" + o.getPrice() + "','" + o.getOrderStatus().toString() + "','" + o.getOrderDate() + "')");

        WorkerClass.addOrder(o);
    }

    public static void updateOrderStatus(String phone, Status status) throws SQLException {
        Statement stmt = SQLConnection.getConnection().createStatement();
        stmt.execute("UPDATE logs SET order_status = '" + status.toString() + "' WHERE phone = '" + phone + "'");
    }
}
