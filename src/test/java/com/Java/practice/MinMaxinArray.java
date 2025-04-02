package com.Java.practice;

public class MinMaxinArray {
    public static void main(String[] args) {
        int [] arr = {1,5,45,13,58,34}; // List of array.
        int min = arr[0]; // Assuming the first number in array is min
        int max = arr[0]; // Assuming first number  in array is Max.

        for (int i=1 ; i<arr.length ; i++){
            if (arr[i]<min){
                min = arr[i];
            }

            if (arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Minimum number in the array is "+ min);
        System.out.println("Maximum number in the array is "+ max);
    }
}
