package org.example.patterns;

public class Pattern12 {
//    1      1
//    12    21
//    123  321
//    12344321
    public static void main(String[] args) {
        int counter = 6;
        for(int i = 1 ;i < 5 ;i ++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            for (int k =counter;k>0;k--){
                System.out.print(" ");
            }
            counter-=2;
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
