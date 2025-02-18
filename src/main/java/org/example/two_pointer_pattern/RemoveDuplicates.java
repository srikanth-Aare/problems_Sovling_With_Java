package org.example.two_pointer_pattern;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[] {2,2, 3, 3,4,4,6, 9, 9};

        System.out.println(countDuplicatesSortedArray(arr));

    }
    public static int countDuplicatesSortedArray(int[] arr) {
        int nextNonDuplicate = 1;
        for (int currentIndex = 1; currentIndex < arr.length; currentIndex++) {

            if (arr[currentIndex] == arr[currentIndex-1]) {
                System.out.println("Duplicate found: " + arr[currentIndex]);
            }

            if (arr[currentIndex] != arr[currentIndex-1]) {
                nextNonDuplicate++;
            }
        }
        System.out.print("number of duplicates are: ");
        return nextNonDuplicate-1;
    }

}
