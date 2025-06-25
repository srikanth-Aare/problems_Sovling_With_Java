package org.example.arrays.medium;

import java.util.Arrays;
import java.util.HashMap;

public class SumOf2NumberInArray {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        System.out.println(findSumOf2NumberInArrayForTargetedSum2(arr,14));
    }


    // Brute Force Approach
    // Time complexity: O(n2)
    // Space Complexity: O(1)
    private static void findSumOf2NumberInArrayForTargetedSum(int[]arr,int target){
        int sum  = 0;
        for(int i = 1; i< arr.length;i++){
            for(int j=0;j< i;j++){
               sum += arr[i]+arr[j];
                if(sum == target){
                    System.out.println("YES -- Found the Match for TargetedSum");
                    System.out.println("Numbers are :"+ arr[i]+","+arr[j]);
                }
                sum = 0;
            }
        }
    }

    // Brute Force Approach
    // Time complexity: O(n2)
    // Space Complexity: O(1)
    public static String twoSum(int []arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) return "YES";
            }
        }
        return "NO";
    }

    // Better approach
    // Time complexity: O(nlog n)
    // Space Complexity: O(1)
    public static String twoSum(int n, int []arr, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return "YES";
            }

            mpp.put(arr[i], i);
        }
        return "NO";
    }

    // Optimal approach
    // Time complexity: O(2n)
    // Space Complexity: O(1)
    public static String findSumOf2NumberInArrayForTargetedSum2(int []arr, int target) {
        Arrays.sort(arr);
       int left = 0, right = arr.length - 1;
       while (left < right){
           int sum = arr[left] + arr[right];
           if(sum == target) {
               return "YES";
           }else if (sum < target) {
               left ++;
           }
           else right --;
       }
       return "NO";
    }
}
