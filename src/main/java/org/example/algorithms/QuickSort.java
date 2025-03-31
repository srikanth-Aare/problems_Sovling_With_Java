package org.example.algorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10,16,8,12,15,6,3,9,5};

        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr));

        quickSort(arr,0, arr.length-1);

        System.out.print("Array after sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int partitionIndex = findPivot(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int findPivot(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1) {
                i++;
            }
            while(arr[j]>pivot && j>=low+1) {
                j--;
            }
            if(i < j) swapValuesInArray(arr,i,j);
        }
        swapValuesInArray(arr,low,j);
        return j;
    }

    private static void swapValuesInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    static int partition(List<Integer> arr, int low, int high) {
//        int pivot = arr.get(low);
//        int i = low;
//        int j = high;
//
//        while (i < j) {
//            while (arr.get(i) <= pivot && i <= high - 1) {
//                i++;
//            }
//
//            while (arr.get(j) > pivot && j >= low + 1) {
//                j--;
//            }
//            if (i < j) {
//                int temp = arr.get(i);
//                arr.set(i, arr.get(j));
//                arr.set(j, temp);
//            }
//        }
//        int temp = arr.get(low);
//        arr.set(low, arr.get(j));
//        arr.set(j, temp);
//        return j;
//    }

}
