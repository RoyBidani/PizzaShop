package com.company.Status;

public class Pending extends Status {
    int cancelationFee = 0;
    public  Pending(){
        super("Pending");
    }

    public static String getStatus() {
        return "Pending";
    }

}
