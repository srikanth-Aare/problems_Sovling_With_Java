package org.example.patterns;

public class Pattern14 {

//     **********
//     ****  ****
//     ***    ***
//     **      **
//     *        *
//     *        *
//     **      **
//     ***    ***
//     ****  ****
//     **********

    public static void main(String[] args) {
        int count = 0;
        for(int i = 5 ;i > 0 ;i--){
            for(int j =0;j<i;j++){
                System.out.print("*");
            }
            for (int k =0;k<count;k++){
                System.out.print(" ");
            }
            count+=2;
            for(int j = i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        int counter = 7;
        for(int i = 1 ;i < 6 ;i ++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for (int k =counter;k>=0;k--){
                System.out.print(" ");
            }
            counter-=2;
            for(int j = i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
