package org.example.recursion;

public class RecursionDemo {
    public static void main(String[] args) {
//        printNumbers(9);
//        printName(1,5,"Srikanth Reddy");
//        printName2(5,"Srikanth Reddy");
        printNumber(3,3);
    }

    public static  void printNumbers(int num){
        if(num >10){
            return;
        }
        num ++;
        System.out.println(num);
        printNumbers(num);
    }

    public static void printName(int i, int limit,String name){
       if(i>limit)return;
       System.out.println(name);
        printName(i+1,limit,name);
    }
    public static void printName2(int limit,String name){
        if(0>=limit)return;
        limit--;
        System.out.println(name);
        printName2(limit,name);
    }

    public static void printNumber(int i,int n){
        if(i<1)
            return;
        printNumber(i-1,n);
        System.out.println(i);

    }
}
