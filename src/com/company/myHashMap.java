package com.company;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class myHashMap{
    List<String > string;
    List<Order> order;

    myHashMap(){
        string = new ArrayList<>();
        order = new ArrayList<>();
    }
    public String put(String s,Order o){
        for (String p: string){
            if (p == null) {
                string.add(s);
                order.add(o);
                return null;
            }
            else if(p.equals(s)){
                string.add(s+"1");
                order.add(o);
                return null;
            }

        }
        string.add(s);
        order.add(o);
        return null;
    }


    public Order get(String s){
       int index = string.indexOf(s);
        return order.get(index);
    }



    public void remove(String s){
        int index = string.indexOf(s);
        string.remove(index);
        order.remove(index);
    }

    public List<String> keySet(){
        List<String> set = new ArrayList<>();
        for (String s: string){
            set.add(s);
        }
        return set;
    }

}
