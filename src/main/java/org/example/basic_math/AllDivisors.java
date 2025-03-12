package org.example.basic_math;

import java.util.ArrayList;

public class AllDivisors {
    public static void main(String[] args) {
        print_all_Divisors(24);
        System.out.println();
        System.out.println(findDivisors(24));
    }

    public static void print_all_Divisors(int num) {
        System.out.print("divisor are : ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {

                System.out.print(i+" ");
            }
        }
    }

    public static ArrayList<Integer> findDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }
}
