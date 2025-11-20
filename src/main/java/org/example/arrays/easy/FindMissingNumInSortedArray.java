package org.example.arrays.easy;

public class FindMissingNumInSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,6};
        System.out.println(findMissingNumber2(arr1,arr1.length));


    }

    //Brute Force Approach
    //Time complexity: O(n2)
    //Space Complexity: O(1)
    public static int findMissingNumber(int []a) {
        for (int i = 1; i <= a.length; i++) {
            int flag = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) return i;
        }
        // It is just to avoid warnings.
        return -1;
    }

    public static int findMissingNum(int []arr1) {
        for (int i = 1; i <= arr1.length-2; i++) {
            if(arr1[i]+1 != arr1[i+1]){
               return arr1[i]+1;
            }
        }
        return -1;
    }

    //Better Approach
    //Time complexity: O(2N)
    //Space Complexity: O(N)
    public static int findMissingNumber2(int []a, int N) {

        int hash[] = new int[N + 1]; //hash array

        // storing the frequencies:
        for (int i = 0; i < N - 1; i++) {
            hash[a[i]]++;
        }
        //checking the freqencies for numbers 1 to N:
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }


    //Optimal Approach
    public static int findMissingNumber3(int []a, int N) {

        //Summation of first N numbers:
        int sum = (N * (N + 1)) / 2;

        //Summation of all array elements:
        int s2 = 0;
        for (int i = 0; i < N - 1; i++) {
            s2 += a[i];
        }

        int missingNum = sum - s2;
        return missingNum;
    }
}
