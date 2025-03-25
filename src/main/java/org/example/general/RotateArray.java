package org.example.general;

import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};


        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

//        System.out.println(integerList);

//        System.out.println(rotateArrayByDegree((ArrayList<Integer>) integerList,6));

        System.out.println("Actual Array: " + Arrays.toString(arr));
        reverse(arr, 4);


//        rotateArrayByDegree(arr,2);
//        System.out.println("Rotated Array: "+ Arrays.toString(arr));


    }

    public static ArrayList<Integer> rotateArrayByDegree(ArrayList<Integer> arrayList, int degree) {
        int swap = 0;
        for (int i = 0; i < degree; i++) {
            swap = arrayList.get(0);
            arrayList.remove(0);
            arrayList.add(swap);
        }
        return arrayList;
    }

    public static void rotateArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverse(int[] arr, int degree) {
        degree = degree % arr.length;
        System.out.println("degree: " + degree);
        if (degree < 0) {
            degree = degree + arr.length;
        }
        rotateArray(arr, 0, arr.length - 1);
        System.out.println("first rotation: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("degree: " + degree);
        System.out.println("second rotation: ");
        rotateArray(arr, 0, degree - 1);
        System.out.println(Arrays.toString(arr));

        System.out.println("third rotation: ");
        rotateArray(arr, degree, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArrayByDegree(int[] arr, int degree) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < degree; i++) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
