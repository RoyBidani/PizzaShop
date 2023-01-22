package com.company.Status;

import com.company.Status.Status;

public class Preparation extends Status {
    int cancelationFee = 10;

    public Preparation(){
        super("Preparation");
    }

    public static String getStatus() {
        return "Preparation";
    }
}
