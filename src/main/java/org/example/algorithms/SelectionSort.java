package org.example.algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {13, 46, 24, 52, 20, 9};

        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr1));

        selectionSort(arr1);

        System.out.print("Array after sorting: ");
        System.out.println(Arrays.toString(arr1));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minValueIndex] > arr[j]) {
                    minValueIndex = j;
                }
            }
            swapValuesInArray(arr, minValueIndex, i);
        }
    }

    private static void swapValuesInArray(int[] arr, int minValueIndex, int replacingIndex) {
        int temp = arr[replacingIndex];
        arr[replacingIndex] = arr[minValueIndex];
        arr[minValueIndex] = temp;
    }


}
