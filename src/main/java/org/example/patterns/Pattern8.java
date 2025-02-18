package org.example.patterns;

public class Pattern8 {

//     ***********
//      *********
//       *******
//        *****
//         ***
//          *

    public static void main(String[] args) {
        int count = 0;
        for (int i = 12; i > 0; i -= 2) {
            for( int k = 0;k < count ;k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            count ++;
            System.out.println();
        }
    }
}
