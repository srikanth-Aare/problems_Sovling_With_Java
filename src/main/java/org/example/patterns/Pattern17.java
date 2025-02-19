package org.example.patterns;

public class Pattern17 {

//        ABCDE
//        ABCD
//        ABC
//        AB
//        A

    public static void main(String[] args) {
        for( char i = 'E' ;i >= 'A';i--){
            for( char j = 'A' ;j <= i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
