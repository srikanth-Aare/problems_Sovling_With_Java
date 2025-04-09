package org.example.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {3,0,0,4,1,0,2,0,4};
        System.out.println(Arrays.toString(moveZeros(arr)));

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

    // Optimal approach
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
}
