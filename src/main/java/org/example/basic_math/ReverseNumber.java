package org.example.basic_math;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(24300));
        System.out.println(palindromeNumber(2320));
    }

    public static String reverseNumber(int num){
        StringBuilder reverseNumber = new StringBuilder();
        while (num > 0){
            int reminder = num%10;
            if(reminder > 0) {
                reverseNumber.append(reminder);
            }
            num = num/10;
        }
        return reverseNumber.toString();
    }

    public static boolean palindromeNumber(int num){
        int temp ;
        temp = num;
        StringBuilder reverseNumber = new StringBuilder();
        while (num > 0){
            reverseNumber.append(num%10);
            num = num/10;
        }
        return temp == Integer.parseInt(reverseNumber.toString());
    }
}
