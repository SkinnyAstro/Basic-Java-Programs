package com.Java.practice;
public class Fibonacci {
    public static void main(String[] args) {
       int n = 10;
       int first = 0 , second = 1;
        System.out.println("Fibonacci number upto "+ n + "terms: ");
        for (int i=0 ; i<n ; i++) {
            System.out.print(first + " ");
            int next = first+second;
            first= second;
            second= next;
        }

    }
}
