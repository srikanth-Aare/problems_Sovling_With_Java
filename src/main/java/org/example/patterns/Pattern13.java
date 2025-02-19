package org.example.patterns;

public class Pattern13 {
//    1
//    2 3
//    4 5 6
//    7 8 9 10
//    11 12 13 14 15
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1 ;i < 6 ;i ++){
            for(int j =1;j<=i;j++){
                System.out.print((sum+j)+" ");
            }
            sum = sum + i;
            System.out.println();
        }
    }
}
