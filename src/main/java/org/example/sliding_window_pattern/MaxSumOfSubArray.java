package org.example.sliding_window_pattern;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println("Maximum sum subArray of size " + k + " is: " + findMaxSumOfSubArray(k,arr));
        System.out.println("Maximum sum subArray of size " + k + " is: " + findMaxSumOfSubArray2(k,arr));

    }

    private static int findMaxSumOfSubArray(int k, int[] arr) {
        int maxSum = 0;
        int windowSum = 0;
        for (int j=0;j<=arr.length-k;j++){
            for(int i =j;i<k+j;i++){
                windowSum += arr[i];
            }
            if(windowSum > maxSum){
                maxSum = windowSum;
            }
            windowSum = 0;
        }
        return maxSum;
    }

    private static int findMaxSumOfSubArray2(int k, int[] arr) {
        int maxSum = 0;
        int windowSum = 0;

        // Compute the sum of the first K elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide the window over the array
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];  // Add new element, remove old element
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
