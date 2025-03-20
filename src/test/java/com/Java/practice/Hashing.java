
package com.Java.practice;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        //country<key> , population<value>
        HashMap<String,Integer> map = new HashMap();

        //Insertion.
        map.put("India",200);
        map.put("America",200);
        //System.out.println(map);

        map.put("India",300);
        //System.out.println(map);
        if (map.containsKey("Indonesia")){ // this will return true or false.
            System.out.println("Key is present");
        }else {
            System.out.println("Key is not present");
        }

        System.out.println(map.get("India")); //this will return the value of key Inida.
        System.out.println(map.get("England")); // this will return null value as England key is not present.

//        HashMap<String,Integer> map1 = new HashMap();
//        map1.put("Petrol",20);
//        map1.put("CNG",100);
//        map1.put("Diesel",120);
//        System.out.println(map1);
    }

}
