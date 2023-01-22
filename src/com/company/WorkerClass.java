package com.company;

import com.company.SQL.ToSql;
import com.company.ScannerGetter;
import com.company.Status.Delivered;
import com.company.Status.InTransit;
import com.company.Status.Preparation;

import java.sql.SQLException;
import java.util.HashMap;

public class WorkerClass {
    static myHashMap activeOrders = new myHashMap();

    public WorkerClass() {
        activeOrders = new myHashMap();
    }

    public static void addOrder(Order o){
        activeOrders.put(o.getPhone(),o);
    }
    public void updateToPreparation(String phone) throws SQLException {
        activeOrders.get(phone).setStatus(new Preparation());
        ToSql.updateOrderStatus(phone,activeOrders.get(phone).getOrderStatus());
    }
    public void updatToInTransit(String phone) throws SQLException {
        activeOrders.get(phone).setStatus(new InTransit());
        ToSql.updateOrderStatus(phone,activeOrders.get(phone).getOrderStatus());
    }
    public void updateToDelivered(String phone) throws SQLException {
        activeOrders.get(phone).setStatus(new Delivered());
        ToSql.updateOrderStatus(phone,activeOrders.get(phone).getOrderStatus());
        activeOrders.remove(phone);
    }
    public void showAllOrders(){
        for(String key : activeOrders.keySet()){
            System.out.println(activeOrders.get(key).toString());
        }
    }

    public void main() throws SQLException {
        boolean flag = true;
        while(flag){

            System.out.println("WORKER MENU");
            System.out.println("[1] - Show all orders");
            System.out.println("[2] - Update to preparation");
            System.out.println("[3] - Update to in transit");
            System.out.println("[4] - Update to delivered");
            System.out.println("\n[0] - Exit");
            int choice = ScannerGetter.scanInt();
            switch (choice){
                case 1:
                    showAllOrders();
                    break;
                case 2:
                    System.out.println("Enter phone number");
                    String phone = ScannerGetter.scanString();
                    updateToPreparation(phone);
                    break;
                case 3:
                    System.out.println("Enter phone number");
                    phone = ScannerGetter.scanString();
                    updatToInTransit(phone);
                    break;
                case 4:
                    System.out.println("Enter phone number");
                    phone = ScannerGetter.scanString();
                    updateToDelivered(phone);
                    break;

                case 0:
                    flag = false;
                    break;
            }
        }
    }




}
