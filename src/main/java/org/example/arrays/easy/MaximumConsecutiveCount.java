package org.example.arrays.easy;

public class MaximumConsecutiveCount {
    public static void main(String[] args) {
       int[] prices = {1, 1, 0,0,0,0,1, 1, 1,0,0,1,1,1,1,1};
        System.out.println(findMaximumConsecutiveCount(prices));
    }

    //Optimal Approach
    //Time complexity: O(n)
    //Space Complexity: O(1)
    private static int findMaximumConsecutiveCount(int[]arr){
        int count = 1;
        int finalCount  = 1;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                count ++;
            }
            else {
                count = 1;
            }
            if (finalCount < count){
                finalCount = count;
            }
        }
        return finalCount;
    }
}
