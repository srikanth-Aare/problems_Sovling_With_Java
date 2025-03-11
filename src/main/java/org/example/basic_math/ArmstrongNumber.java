package org.example.basic_math;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println(isArmstrongNumber(371));
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(372));
    }
    public static int countDigitsInGivenNumber(int num){
        return (int) (Math.log10(num)+1);
    }
    public static boolean isArmstrongNumber(int num){

//        int lengthOfDigits = countDigitsInGivenNumber(num);
        int lengthOfDigits = String.valueOf(num).length();
        int actualNum = num;
        int finalSum = 0;
        while (num > 0){
            int sum = 1;
            int reminder = num % 10;
            for(int i = 1;i<=lengthOfDigits;i++){
                sum *= reminder;
            }
            num = num/10;
            finalSum += sum;
        }
        System.out.println(finalSum);

        return finalSum == actualNum;
    }
}
