package org.example.arrays.easy;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {3,0,0,4,1,0,2,0,4};
        System.out.println(Arrays.toString(moveZeros(arr.length,arr)));

        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    // normal approach
    private static int[] moveZeros(int[]arr){
        int counter = 0;
        int[] tempArr = new int[arr.length];
        for (int j : arr) {
            if (j != 0) {
                tempArr[counter] = j;
                counter++;
            }
        }
        return tempArr;
    }

    // Better approach
    //Time Complexity: O(2N)
    public static void moveZeroesToEnd(int[] nums) {
        int index = 0;

        // Step 1: Move non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // Step 2: Fill remaining positions with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }

    }

    // Optimal approach
    //Time Complexity: O(N)
    //Space Complexity: O(1)
    private static int[] moveZeros(int n, int []a) {
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) return a;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }
}
