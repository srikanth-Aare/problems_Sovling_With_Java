package org.example.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionElementsInSortedArray {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,3,4,4,5,6,8,8,9};
        int[] arr2 = {1,3,3,4,5,6,7,7,9};

        System.out.println(findIntersectionElements2(arr1,arr2));

    }

    //BrutForce Solution
    //Time complexity: O(n1*n2)
    //Space Complexity: O(n2)
    private static ArrayList<Integer> findIntersectionElements(int[]arr1, int[]arr2){
        ArrayList<Integer> interSectionArray = new ArrayList<>();
        int[] visitedArray = new int[arr2.length];

        for(int i=0 ;i<arr1.length;i++){
           for(int j =0;j< arr2.length;j++){
                if(arr1[i] == arr2[j] && visitedArray[j]==0){
                    interSectionArray.add(arr1[i]);
                    visitedArray[j]=1;
                    break;
                }
                if(arr2[j] > arr1[i]) break;
            }
        }
        return interSectionArray;
    }

    // Optimal Solution
    //Time complexity: O(n1+n2)
    //Space Complexity: O(1)
    private static ArrayList<Integer> findIntersectionElements2(int[]arr1, int[]arr2){
        ArrayList<Integer> interSectionArray = new ArrayList<>();
        int i = 0 ,j = 0;
        while (i < arr1.length && j < arr2.length ){
            if((arr1[i] < arr2[j])){
                i++;
            }
            else if((arr1[i] > arr2[j])){
                j++;
            }
            else{
                interSectionArray.add(arr1[i]);
                i++;
                j++;
            }
        }
        return interSectionArray;
    }
}
