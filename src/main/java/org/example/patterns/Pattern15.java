package org.example.patterns;

public class Pattern15 {

//     *          *
//     **        **
//     ***      ***
//     ****    ****
//     *****  *****
//     ************
//     *****  *****
//     ****    ****
//     ***      ***
//     **        **
//     *          *

    public static void main(String[] args) {
        int counter = 11;
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int k =counter;k>=0;k--){
                System.out.print(" ");
            }
            counter-=2;
            for (int j = i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        int count =0;
        for (int i = 6; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int k=0;k<count;k++){
                System.out.print(" ");
            }
            count+=2;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
