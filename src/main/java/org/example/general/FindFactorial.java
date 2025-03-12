package org.example.general;



import java.math.BigInteger;

public class FindFactorial {

    public static void main(String[] args) {
        System.out.println(findFactorial(40));
    }

    public static BigInteger findFactorial(int number){
        BigInteger fact = BigInteger.ONE;
        for(int i = 1;i <= number;i++){
            fact = fact.multiply(BigInteger.valueOf(number));
        }
        return fact;
    }
}
