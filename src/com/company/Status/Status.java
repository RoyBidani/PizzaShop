package com.company.Status;

public abstract class Status {
    public static String status;
    public static String getStatus(){return status;}
    public Status(String status){
        this.status = status;
    }

    @Override
    public String toString() {
        return getStatus();
    }
    public void setStatus(Status s){
        status = s.toString();
    }
}
