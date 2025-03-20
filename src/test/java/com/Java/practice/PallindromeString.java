package com.Java.practice;

public class PallindromeString {

    public static boolean isPallindrome(String str){
        String rev = new StringBuilder(str).reverse().toString(); // we are creating an new rev variable of String type.
        return rev.equals(str); // we are are returning an boolean value whether rev value is equal to str.
    }

    public static void main(String[] args) {
        System.out.println(isPallindrome("Hello")); // this will return the value as false
        System.out.println(isPallindrome("madam")); // this will return the value as true.
    }
}
