package org.example.algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr1 = {13, 46, 24, 52, 20, 9};

        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr1));

        insertionSort(arr1);

        System.out.print("Array after sorting: ");
        System.out.println(Arrays.toString(arr1));
    }

    private static void insertionSort(int[] arr1) {
        for (int j = 0; j < arr1.length-1; j++) {
            if (arr1[j] > arr1[j+1]) {
                swapValuesInArray(arr1,j,j+1);
                j = -1;
            }
        }
    }
    private static void swapValuesInArray(int[] arr1, int i, int j) {
        int temp = arr1[i];
        arr1[i] = arr1[j];
        arr1[j] = temp;;
    }
}
