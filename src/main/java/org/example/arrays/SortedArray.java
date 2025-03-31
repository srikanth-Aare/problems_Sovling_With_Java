package org.example.arrays;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 9, 10, 12, 15, 16};

        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("isArraySorted : "+isArraySorted(arr));
    }

    private static boolean isArraySorted(int[]arr){
        int count = arr.length-1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] < arr[i+1]){
                count --;
            }
        }
        return count == 0;
    }
}
