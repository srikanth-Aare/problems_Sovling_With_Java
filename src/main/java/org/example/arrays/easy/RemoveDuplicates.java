package org.example.arrays.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        System.out.println(removeDuplicates2(arr));
    }


    //Time complexity: O(n*log(n))+O(n)
    //Space Complexity: O(n)
    private static int[] removeDuplicates(int[]arr){
        Set<Integer> integersSet = new HashSet <>();
        for(int i : arr){
            integersSet.add(i);
        }
        int index = 0;
        for(int num : integersSet){
            arr[index]= num;
            index++;
        }
        return arr;
    }

    //Time Complexity: O(N)
    //Space Complexity: O(1)
    private static int removeDuplicates2(int[]arr){
     int i = 0;
     for(int j = 1;j<arr.length;j++){
         if(arr[i] != arr[j]){
             arr[i+1] = arr[j];
             i++;
         }
     }
        return i+1;
    }
}
