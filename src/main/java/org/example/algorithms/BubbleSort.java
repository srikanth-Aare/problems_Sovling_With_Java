package org.example.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {13, 46, 24, 52, 20, 9};

        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr1));

        bubbleSort(arr1);

        System.out.print("Array after sorting: ");
        System.out.println(Arrays.toString(arr1));
    }

    private static void bubbleSort(int[] arr1) {

        for (int i = 0; i < arr1.length - 1; i++) {

            for (int j = i + 1; j < arr1.length; j++) {

                if (arr1[i] > arr1[j]) {
                    swapValuesInArray(arr1,i,j);
                }
            }
        }
    }

    private static void swapValuesInArray(int[] arr1, int i, int j) {
        int temp = arr1[i];
        arr1[i] = arr1[j];
        arr1[j] = temp;;
    }
}
