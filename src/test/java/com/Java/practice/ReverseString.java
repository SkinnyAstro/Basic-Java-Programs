package com.Java.practice;
public class ReverseString {
    public static void main(String[] args) {
        String str = "Prashik Dhule";
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();

        System.out.println("Reverse string is " + reverse);
        ReverseString RS = new ReverseString();
        RS.UsingLoop();

    }
    public void UsingLoop(){
        String str = "SDET";
        String reverse = "";

        for (int i = str.length()-1;i>=0 ; i--){
             reverse+=str.charAt(i);
            System.out.println(reverse);
        }
    }
}
