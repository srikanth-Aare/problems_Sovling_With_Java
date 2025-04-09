package org.example.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    static int[] arr = {3,1,2,4,1,5,2,6,4};
    public static void main(String[] args) {
        System.out.println(removeDuplicates(arr));
    }
    private static Set<Integer> removeDuplicates(int[]arr){
        Set<Integer> integersSet = new HashSet <>();
        for(int i : arr){
            integersSet.add(i);
        }
        return integersSet;
    }

    public int removeDuplicates2(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }
}
