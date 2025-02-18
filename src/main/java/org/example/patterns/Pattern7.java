package org.example.patterns;

public class Pattern7 {

//                  *
//                 ***
//                *****
//               *******
//              *********
    public static void main(String[] args) {
        int count = 5;
            for (int i = 0; i < 12; i += 2) {
                for( int k = count;k >0 ;k--) {
                    System.out.print(" ");
                    }
                for (int j = 1; j < i; j++) {
                    System.out.print("*");
                }
                count --;
                System.out.println();
            }
    }
}
