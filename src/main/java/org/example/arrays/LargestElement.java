package org.example.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10,16,8,12,15,6,3,9,5};
        System.out.print("Largest Element is:"+findLargestNumber(arr) + " In Array");

        System.out.println();
        System.out.print("2nd Largest Element is:"+find2NdLargestNumber(arr) + " In Array");

        System.out.println();
        System.out.print("2nd Largest Element is:"+find2NdLargestNumberUsingStreams(arr) + " In Array");
    }

    private static int findLargestNumber(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    private static int find2NdLargestNumber(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax =  Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        for(int j : arr){
            if(j > secondMax && j < max){
                secondMax = j;
            }
        }
        return secondMax;
    }

    private static OptionalInt find2NdLargestNumberUsingStreams(int[] arr) {
        OptionalInt secondLargest = Arrays.stream(arr)
                .distinct()                  // Remove duplicates
                .sorted()                    // Sort in ascending order
                .skip(arr.length - 2)    // Skip to the second last element
                .findFirst();                // Get the second largest

//        // Display the result
//        secondLargest.ifPresent(System.out::println);
        return secondLargest;
    }
}
