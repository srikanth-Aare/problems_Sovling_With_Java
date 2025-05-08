package org.example.arrays;

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println("Actual Array is : "+Arrays.toString(arr));
        System.out.println("Array After one left rotation:");
        System.out.println(Arrays.toString(leftRotateBy1Place(arr)));

        System.out.println();
        int[] arr1 = {1,2,3,4,5};
        System.out.println("Array After given no of left rotation:");
        System.out.println(Arrays.toString(leftRotateByNPlaces(arr1,3)));
    }

    private static int[] leftRotateBy1Place(int[]arr){
        int temp = arr[0];
        for(int i = 0 ;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]= temp;
        return arr;
    }

    private  static  int[] leftRotateByNPlaces(int[] arr, int noOfMoves){
        if(arr.length < noOfMoves){
            noOfMoves = noOfMoves - arr.length;
        }
        for (int j = 0; j < noOfMoves;j++){
            int temp = arr[0];
            for(int i = 0 ;i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1]= temp;
        }
        return arr;
    }
}
