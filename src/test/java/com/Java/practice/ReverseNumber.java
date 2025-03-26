package com.Java.practice;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int rev = 0; // we are creating an rev variable of type int and assigning 0 as the value
        while (number!=0){
            rev= rev*10+number%10;
            number/=10;

        }
        System.out.println("The reverse number is "+ rev);
    }

}

