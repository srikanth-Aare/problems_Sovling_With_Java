package org.example.arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {10,16,8,12,15,6,3,9,5};
        System.out.print("Smallest Element is:"+findSmallestNumber(arr) + " In Array");

        System.out.println();
        System.out.print("2nd Smallest Element is:"+find2NdSmallestNumber2(arr) + " In Array");
    }

    // Better Approach
    // TC is 0(2n)
    private static int find2NdSmallestNumber(int[] arr) {
        int smallestNumber = Integer.MAX_VALUE;
        int secondSmallestNumber = Integer.MAX_VALUE;
        for(int num : arr){
            if(num < smallestNumber){
                smallestNumber = num;
            }
        }
        for (int num : arr){
            if(num < secondSmallestNumber && num > smallestNumber){
                secondSmallestNumber = num;
            }
        }
        return secondSmallestNumber;
    }

    //TC is 0(n)
    private static int findSmallestNumber(int[] arr) {
        int smallestNumber = Integer.MAX_VALUE;
        for(int num : arr){
            if(num < smallestNumber){
                smallestNumber = num;
            }
        }
        return smallestNumber;
    }

    // Optimal Solution
    // TC is O(n)
    private static int find2NdSmallestNumber2(int[] arr){
        int smallestNumber = arr[0];
        int secondSmallestNumber =  Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < smallestNumber) {
                secondSmallestNumber = smallestNumber;
                smallestNumber = num;
            }
            else if(num < secondSmallestNumber && num > smallestNumber){
                secondSmallestNumber = num;
            }
        }
        return secondSmallestNumber;
    }
}
