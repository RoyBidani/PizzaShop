package com.company;

import com.company.SQL.FromSql;

import java.sql.SQLException;

public class Client {
    private String phoneNumber;
    private String fname;
    private String lname;
    private String address;
    private String email;

    public Client() {
    }
    public Client(String phone) throws SQLException {
        Client client = FromSql.getclient(phone);
        this.phoneNumber = client.phoneNumber;
        this.fname = client.fname;
        this.lname = client.lname;
        this.address = client.address;
        this.email = client.email;
    }

    public Client setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Client setFname(String fname) {
        this.fname = fname;
        return this;
    }

    public Client setLname(String lname) {
        this.lname = lname;
        return this;
    }

    public Client setAddress(String address) {
        this.address = address;
        return this;
    }

    public Client setEmail(String email) {
        this.email = email;
        return this;
    }
    public boolean exist(){
        if (phoneNumber != null)
            return true;
        return false;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return
                "phoneNumber='" + phoneNumber + '\'' +
                ", first name='" + fname + '\'' +
                ", last name='" + lname + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' ;
    }
}
