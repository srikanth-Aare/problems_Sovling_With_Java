package org.example.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.print("Array after sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    swapValuesInArray(arr,i,j);
                }
            }
        }
    }

    private static void swapValuesInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;;
    }
}
