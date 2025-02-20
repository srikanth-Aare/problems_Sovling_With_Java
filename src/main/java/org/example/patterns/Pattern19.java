package org.example.patterns;

public class Pattern19 {

//        E
//        D E
//        C D E
//        B C D E
//        A B C D E

    public static void main(String[] args) {
        for( char i = 'E' ;i >= 'A';i--){
            for( char j = i ;j <='E';j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
