package org.example.arrays.medium;

import java.util.Arrays;

public class SortArray0s1sAnd2s {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0,2,1,0,2,0,1,2};
        System.out.println(Arrays.toString(arr));
        ArraySort2(arr);
        System.out.println(Arrays.toString(arr));
    }


    // Better approach
    // Time complexity: O(n)+O(n)
    // Space Complexity: O(1)
    public static void ArraySort(int[]arr){
        int counter0= 0, counter1 =0;
        for (int j : arr) {
            if (j == 0) {
                counter0++;
            } else if (j == 1) {
                counter1++;
            }
        }
        for (int i = 0;i<counter0;i++){
            arr[i]=0;
        }
        for (int i = counter0;i<counter0+counter1;i++){
            arr[i]=1;
        }
        for (int i = counter0+counter1;i<arr.length;i++){
            arr[i]=2;
        }
    }

    // Optimal approach
    // Time complexity: O(n)
    // Space Complexity: O(1)
     public static void ArraySort2(int[]arr){
        int low = 0, mid = 0, high = arr.length-1;
        while (mid<=high){
            if(arr[mid]==0){
                swapValuesInArray(arr,low,mid);
                low++;
                mid++;
            }
            if(arr[mid]==1){
                mid++;
            }
            else {
                swapValuesInArray(arr,mid,high);
                high--;
            }
        }
     }
    private static void swapValuesInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;;
    }
}
