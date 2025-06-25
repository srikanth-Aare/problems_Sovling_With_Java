package org.example.arrays.medium;

public class LongestSubArray {
    public static void main(String[] args) {
        int array[] = {2,3,2,4,3,1};
        System.out.println(findLongestSubArrayToGiveSum(7,array));

        System.out.println(findLongestSubArrayToGiveSum3(array,7));
    }

    // Brute Force Approach
    // Time complexity: O(n2)
    // Space Complexity: O(1)
    private static int findLongestSubArrayToGiveSum(int targetSum, int[]arr){
        int lengthOfSubArray = 0;
        int maxLengthOfSubArray = 0;
        int count = 0;

        for (int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = i;j < arr.length;j++){
                sum += arr[j];
                count ++;
                if(sum == targetSum){
                    lengthOfSubArray = count;
                    sum = 0 ;
                    count = 0;
                }
                if(maxLengthOfSubArray < lengthOfSubArray){
                    maxLengthOfSubArray = lengthOfSubArray;
                }
            }
            count = 0;
        }

        return maxLengthOfSubArray;
    }

    // Brute Force Approach
    // Time complexity: O(n2)
    // Space Complexity: O(1)
    private static int findLongestSubArrayToGiveSum2(int targetSum, int[]arr){
        int lengthOfSubArray = 0;

        for (int i = 0; i < arr.length; i++) {
            long sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == targetSum)
                    lengthOfSubArray = Math.max(lengthOfSubArray, j - i + 1);
            }
        }
        return lengthOfSubArray;

    }

    // Optimal Approach
    // Time complexity: O(2n)
    // Space Complexity: O(1)
    public static int findLongestSubArrayToGiveSum3(int []arr, long targetSum) {

        int left = 0, right = 0;
        long sum = arr[0];
        int maxLen = 0;
        while(right < arr.length){
            while (left <= right && sum > targetSum){
                sum -= arr[left];
                left++;
            }
            if(sum == targetSum){
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
            if(right < arr.length) {
                sum+=arr[right];
            }
        }
        return maxLen;
    }
}
