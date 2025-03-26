package org.example.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,2,6,4};

        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr,0, arr.length-1);

        System.out.print("Array after sorting: ");
        System.out.println(Arrays.toString(arr));


    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low >= high) return;
        int mid = (low + high)/2;

        // sorting 1st half in array
        mergeSort(arr,low,mid);

        // sorting 2nd half in array
        mergeSort(arr,mid+1,high);

        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> tempArray = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high){
            if(arr[left]<=arr[right]){
                tempArray.add(arr[left]);
                left ++;
            }
            else {
                tempArray.add(arr[right]);
                right ++;
            }
        }

        // adding remaining values to temp array from  1st half
        while (left <= mid) {
            tempArray.add(arr[left]);
            left++;

        }

        // adding remaining values to temp array from  2nd half
        while (right <= high) {
            tempArray.add(arr[right]);
            right++;

        }

        for (int i = low; i <= high; i++) {
            arr[i] =  tempArray.get(i-low);
        }
    }
}
