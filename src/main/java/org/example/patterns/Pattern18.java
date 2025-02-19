package org.example.patterns;

public class Pattern18 {
//        A
//        BB
//        CCC
//        DDDD
//        EEEEE

    public static void main(String[] args) {
        for(char i = 'A' ;i < 'F' ;i ++){
            for(char j = 'A';j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
