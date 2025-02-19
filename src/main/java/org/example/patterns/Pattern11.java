package org.example.patterns;

public class Pattern11 {
//            1
//            0 1
//            1 0 1
//            0 1 0 1
//            1 0 1 0 1
    public static void main(String[] args) {
        for(int i = 1 ;i < 6 ;i ++){
            for(int j =1;j<=i;j++){
                if(j%2!=0){
                    System.out.print("1 ");
                }
                if(j%2==0){
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
