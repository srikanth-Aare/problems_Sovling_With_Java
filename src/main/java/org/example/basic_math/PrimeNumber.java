package org.example.basic_math;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(7));
        System.out.println(isPrimeNumber2(7));
    }

    public static  boolean isPrimeNumber(int num){
        int counter = 0;
        if(num == 2){
            return true;
        }

        for(int i = 2;i<num;i++){
            if(num%i==0){
                counter++;
            }
        }
        return counter <= 0;
    }

    //Optimal solution
    public static  boolean isPrimeNumber2(int num){
        int counter = 0;
        if(num == 2){
            return true;
        }

        for(int i = 1;i<= Math.sqrt(num);i++){
            if(num%i==0){
                counter++;
                if(i != num/i){
                    counter++;
                }
            }
        }
        return counter == 2;
    }
}
