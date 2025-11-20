package org.example.arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityOccurs {
    public static void main(String[] args) {
        int[] arr = {1,12,4,4,2,0,1,4,4,4,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(mostOccurs3(arr));



    }


    // Brute Force Approach
    // Time complexity: O(n2)
    // Space Complexity: O(1)
    public static int mostOccurs(int[]arr){
        int target = arr.length/2;
        for( int i = 0;i< arr.length;i++){
            int counter = 0;
            for (int j = i;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    counter++;
                }
            }
            if(counter>target){
                return arr[i];
            }
        }
        return -1;
    }

    // Better Approach
    // Time complexity: O(N*logN)+O(N)
    // Space Complexity: O(N)
    public static int mostOccurs2(int[]arr){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int j : arr) {
            int value = hashMap.getOrDefault(j, 0);
            hashMap.put(j, value + 1);
        }
        for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
            if(entry.getValue() > arr.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }

    // Optimal Approach
    // Time complexity: O(n)+O(n)
    // Space Complexity: O(1)
    public static int mostOccurs3(int[]arr){
        int count = 0;
        int element = 0;
        for (int i : arr) {
            if (count == 0) {
                count = 1;
                element = i;
            } else if (element == i) {
                count++;
            } else count--;
        }

        int count1 = 0;
        for (int j : arr) {
            if (j == element) {
                count1++;
            }
        }
        if(count1 > (arr.length/2)) return element;
        return -1;
    }


}
