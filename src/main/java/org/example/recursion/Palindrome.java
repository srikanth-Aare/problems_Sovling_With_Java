package org.example.recursion;

public class Palindrome {
    public static void main(String[] args) {
        String name = "MADAM";
        if(name.equals(isNumberPalindrome(0,name,""))){
            System.out.println("it's palindrome");
        }
        else {
            System.out.println(isNumberPalindrome(0,name,""));
            System.out.println("it's not palindrome");
        }

        System.out.println(isNumberPalindrome2(0,name));

        System.out.println(isNumberPalindrome3(0,name));

    }

    // brut force approach , time complexity is O(n)
    public static String isNumberPalindrome(int i,String str, String resultStr){
        if(i > str.length()-1)return resultStr;
        return isNumberPalindrome(i+1,str,resultStr+=str.charAt(str.length()-i-1));
    }

    //optimal solution, time complexity is O(n/2)
    public static boolean isNumberPalindrome2(int i,String str){
        char[] s = str.toCharArray();
        if(i > (s.length)/2) return true;
        if(s[i] != s[s.length-i-1]) return false;
        return isNumberPalindrome2(i+1,str);
    }

    //optimal solution, time complexity is O(n/2)
    public static boolean isNumberPalindrome3(int i,String str){
        if(i > ((str.length()-1)/2)) return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return isNumberPalindrome2(i+1,str);
    }

}
