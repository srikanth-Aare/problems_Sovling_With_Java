package org.example.patterns;

public class Pattern4 {

//    1
//    12
//    123
//    1234
//    12345

    public static void main(String[] args) {
        for(int i = 1 ;i < 6 ;i ++){
            for(int j = 1;j<i;j++){
                System.out.print(j);
            }
            System.out.print(i);
            System.out.println();
        }
    }
}
