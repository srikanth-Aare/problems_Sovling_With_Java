package org.example.arrays.medium;

import java.util.*;

public class UnionElementsInSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 6, 6, 7, 8, 9};
        int[] arr2 = {1, 1, 2, 2, 3, 4, 5, 6};
        System.out.println(findUnionElements2(arr1, arr2));
        System.out.println(findUnionElements3(arr1,arr2));

    }

    //Time Complexity: O(2N)+O(1)
    //Space Complexity: O(n1+n2)
    private static ArrayList<Integer> findUnionElements(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for (int k : arr1) {
            freq.put(k, freq.getOrDefault(k, 0) + 1);
        }
        for (int i : arr2) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        Union.addAll(freq.keySet());
        return Union;
    }


    // Brute Force Approach
    // Time Complexity: O(n1 log n + n2 log n) + O(n1 + n2)
    // Space Complexity: O(n1+n2) + O(n1 + n2)
    // 0(n1 + n2) is for the returning the union elements

    // HashSet does not give sorted order
    // But it is faster than HashMap
    // TreeSet gives sorted order
    private static Set<Integer> findUnionElements2(int[] arr1, int[] arr2) {
        Set<Integer> union = new HashSet<>() ;
        for (int k : arr1) {
            union.add(k);
        }
        for (int i : arr2) {
            union.add(i);
        }
        return union;
    }

    // Optimal Solution
    // Time Complexity: O(n1+n2)
    // Space Complexity: O(n1+n2)
    private static ArrayList<Integer> findUnionElements3(int[] arr1, int[] arr2) {
        ArrayList<Integer> unionElements = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (unionElements.isEmpty() || unionElements.get(unionElements.size() - 1) != arr1[i]){
                    unionElements.add(arr1[i]);
                }
                i++;
            } else // case 3
            {
                if (unionElements.isEmpty() || unionElements.get(unionElements.size() - 1) != arr2[j]){
                    unionElements.add(arr2[j]);
                }

                j++;
            }
        }
        while (i < arr1.length) // IF any element left in arr1
        {
            if (unionElements.get(unionElements.size() - 1) != arr1[i]) {
                unionElements.add(arr1[i]);
            }
            i++;
        }
        while (j < arr2.length) // If any elements left in arr2
        {
            if (unionElements.get(unionElements.size() - 1) != arr2[j]) {
                unionElements.add(arr2[j]);
            }
            j++;
        }
        return unionElements;
    }
}
