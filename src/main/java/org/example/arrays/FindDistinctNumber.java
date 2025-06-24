package org.example.arrays;

public class FindDistinctNumber {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println("The single element is: " + getSingleElement3(arr));
    }

    // Brute Force Approach
    // Time complexity: O(n2)
    // Space Complexity: O(1)
    public static int getSingleElement(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i]; // selected element
            int cnt = 0;

            //find the occurrence using linear search:
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num)
                    cnt++;
            }
            if (cnt == 1) return num;
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    // Better Approach
    // Time complexity: O(3n)
    // Space Complexity: O(n)
    public static int getSingleElement2(int []arr) {
        int n = arr.length;
        // Find the maximum element:
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        // Declare hash array of size maxi+1
        // And hash the given array:
        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    // Optimal Approach
    // Time complexity: O(n)
    // Space Complexity: O(1)
    public static int getSingleElement3(int []arr) {
        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < arr.length; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

}
