package org.example.patterns;

public class Pattern10 {

//     *
//     ***
//     *****
//     *******
//     *********
//     ***********
//     *********
//     *******
//     *****
//     ***
//     *

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 6; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
