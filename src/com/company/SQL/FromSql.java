package com.company.SQL;

import com.company.Client;
import com.company.SQLConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FromSql {
    public static Client getclient(String phoneNumber) throws SQLException {
        Statement stmt = SQLConnection.getConnection().createStatement();
        Client client = new Client();
        ResultSet rs = stmt.executeQuery("SELECT * FROM client_accounts WHERE phone = '" + phoneNumber + "'");
       while (rs.next()) {
           client.setFname(rs.getString("fname"));
           client.setLname(rs.getString("lname"));
           client.setPhoneNumber(phoneNumber);
           client.setEmail(rs.getString("email"));
           client.setAddress(rs.getString("address"));
       }
       return client;
    }
}
