package org.example.recursion;

import java.util.Arrays;

public class InsertionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr));

        insertionSortRecursion(arr, 0);

        System.out.print("Array after sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSortRecursion(int[] arr, int n) {

        if(n == arr.length-1) return;

        if (arr[n] > arr[n+1]) {
            int temp = arr[n];
            arr[n] = arr[n+1];
            arr[n+1] = temp;
            n = -1;
        }
        insertionSortRecursion(arr,n + 1);
    }
}
