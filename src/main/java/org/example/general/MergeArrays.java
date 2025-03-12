package org.example.general;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {19,2,5,7,8,9};
        int[] arr2 = {3,6,7,12,14};

        System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2)));
    }

    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length+arr2.length];
        for(int i =0 ;i<arr1.length;i++){
            newArr[i] = arr1[i];
        }

        for(int i =0 ;i<arr2.length;i++){
            newArr[arr1.length+i] = arr2[i];
        }
        for (int i = 0 ;i<newArr.length-1;i++){
            int temp = 0;
            if(newArr[i]<newArr[i+1]){
                temp = newArr[i+1];
                newArr[i+1] = newArr[i];
                newArr[i] = temp;
                i = -1;
            }

        }
        return newArr;
    }
}
