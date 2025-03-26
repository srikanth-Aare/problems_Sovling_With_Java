package org.example.recursion;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr));

        bubbleSortRecursion(arr,arr.length-2);

        System.out.print("Array after sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSortRecursion(int[] arr,int n) {
        //Base case: range == 1.
        if(n==1) return;
        for (int j = 0; j <= n; j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        //Range reduced after recursion:
        bubbleSortRecursion(arr,n-1);
    }
}
