package com.Java.practice;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Prashik Dhule";
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();

        System.out.println("Reverse string is " + reverse);
    }
}
