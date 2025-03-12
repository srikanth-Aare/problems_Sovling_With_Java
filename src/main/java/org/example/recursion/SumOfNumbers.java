package org.example.recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        sum(3,0);
        System.out.println(sum(5));
    }

    // parametrized approach
    public static void sum(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum(i-1,sum+i);
    }

    public static int sum(int num){
        if(num ==0) return 0;
        return num + sum(num-1);
    }


}
