package org.example.arrays.easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,23,46,64};
        System.out.println(findIndexForGivenNumber(arr,23));
    }

    //Time Complexity: O(N)
    //Space Complexity: O(1)
    public static int findIndexForGivenNumber(int[]arr,int number){
        int numberIndexLocation = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==number){
                numberIndexLocation = i;
            }
        }
        return numberIndexLocation;
    }
}
