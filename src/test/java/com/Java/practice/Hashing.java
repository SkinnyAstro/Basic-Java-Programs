
package com.Java.practice;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        //country<key> , population<value>
        HashMap<String,Integer> map = new HashMap();


        //Insertion.
        map.put("India",200);
        map.put("America",200);
        map.put("China",200);
        //System.out.println(map);

        map.put("India",300);
        //System.out.println(map);

        // search operation.
        if (map.containsKey("Indonesia")){ // this will return true or false.
            System.out.println("Key is present");
        }else {
            System.out.println("Key is not present");
        }

        System.out.println(map.get("India")); //this will return the value of key Inida.
        System.out.println(map.get("England")); // this will return null value as England key is not present.

//        int arr[] = {12,15,13};
//        for (int i=0 ; i<3 ; i++){  // using this type of loop we are printing the value of index
//            System.out.print(arr[i]+  " ");
//        }
//        System.out.println();
//
//        for (int value : arr){ // using this type we are directly accessing the value of the index.
//            System.out.print(value + " ");
//        }
//        System.out.println();

        for (Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String>keys = map.keySet();
        for (String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        map.size();




        // removing an value from the map.
//        map.remove("China");
//        System.out.println(map);


//        HashMap<String,Integer> map1 = new HashMap();
//        map1.put("Petrol",20);
//        map1.put("CNG",100);
//        map1.put("Diesel",120);
//        System.out.println(map1);
    }

}
