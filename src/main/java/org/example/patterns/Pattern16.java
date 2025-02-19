package org.example.patterns;

public class Pattern16 {

//        A
//        AB
//        ABC
//        ABCD
//        ABCDE
    public static void main(String[] args) {
        for(char i = 'A' ;i < 'F' ;i ++){
            for(char j = 'A';j<i;j++){
                System.out.print(j);
            }
            System.out.print(i);
            System.out.println();
        }
    }
}
