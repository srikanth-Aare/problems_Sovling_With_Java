package org.example.recursion;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(9));

        for (int i = 0;i < 5 ;i++){
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n){
        if(n <= 1) return n;
        int firstLast = fibonacci(n-1);
        int secondLast = fibonacci(n-2);
        return firstLast + secondLast;
    }
}
