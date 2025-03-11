package org.example.basic_math;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigitsInGivenNumber(1045));
        System.out.println(countDigitsInGivenNumber2(1340));
    }

//    Time Complexity: O(log10N + 1) where N is the input number.
//    The time complexity is determined by the number of digits in the input integer N.
//    In the worst case when N is a multiple of 10 the number of digits in N is log10N + 1.
//    In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations.
//    In each iteration of the while loop we perform constant time operations like division and increment the counter.

//    Space Complexity : O(1) as only a constant amount of additional memory for the counter regardless of size of the input number.
    public static int countDigitsInGivenNumber(int num){
        int digitCounter = 0;
        while (num > 0){
            digitCounter++;
            num = num /10;
        }
        return digitCounter;
    }

//    Time Complexity: O(1)as simple arithmetic operations in constant time are computed on integers.

//    Space Complexity : O(1)as only a constant amount of additional memory for the count variable regardless of size of the input number.
    public static int countDigitsInGivenNumber2(int num){
        return (int) (Math.log10(num)+1);
    }
}
