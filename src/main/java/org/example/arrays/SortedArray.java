package org.example.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 9, 10, 12, 15, 16};

        int[] arr1 = {16, 15, 12, 10, 9, 8, 6, 5, 3};

        int[] numbers = {12, 23, 34, 45, 56, 67, 78};

        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("isArraySorted : "+isArraySorted(arr));

        System.out.println();

        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr1));

        System.out.println("isArraySorted : "+isArraySorted2(arr1));

        System.out.println();

        System.out.print("Array : ");
        System.out.println(Arrays.toString(numbers));

        System.out.println("isArraySorted : "+isArraySortedUsingStreams(numbers));
    }

    private static boolean isArraySorted(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] < arr[i+1]){
            }
            else return false;
        }
        return true;
    }

    private static boolean isArraySorted2(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
            }
            else return false;
        }
        return true;
    }

    private static boolean isArraySortedUsingStreams(int[]numbers){
        // Check if the array is sorted in ascending order
        boolean isSorted = IntStream.range(0, numbers.length - 1)
                .allMatch(i -> numbers[i] <= numbers[i + 1]);
        return isSorted;
    }
}
