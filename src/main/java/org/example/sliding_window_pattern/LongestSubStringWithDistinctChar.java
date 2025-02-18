package org.example.sliding_window_pattern;

import java.util.*;

public class LongestSubStringWithDistinctChar {
    public static void main(String[] args) {

        String str = "AdBBllock";
        System.out.println(subStringWithDistinctChar(str));
        System.out.println(subStringWithDistinctCharWithSize(str,5));
        System.out.println(subStringWithDistinctChar2(str));

    }

    private static int subStringWithDistinctChar(String str) {
        int maxLength = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        HashSet<Character> seen = new HashSet<Character>();
        for(rightIndex = 0; rightIndex < str.length();rightIndex++){
            while(seen.contains(str.charAt(rightIndex))){
                seen.remove(str.charAt(leftIndex));
                leftIndex ++;
            }
            seen.add(str.charAt(rightIndex));
        }
        maxLength = Math.max(maxLength, rightIndex - leftIndex + 1);
        System.out.println(str.substring(leftIndex,rightIndex));
        System.out.println("leftIndex: " + leftIndex + " rightIndex: " + rightIndex);
        return maxLength;
    }

    private static String subStringWithDistinctCharWithSize(String str, int lengthOfSubString) {
        int leftIndex = 0;
        int rightIndex = 0;
        HashSet<Character> seen = new HashSet<Character>();
        for(rightIndex = 0; rightIndex < str.length();rightIndex++){
            while(seen.contains(str.charAt(rightIndex))){
                seen.remove(str.charAt(leftIndex));
                leftIndex ++;
            }
            seen.add(str.charAt(rightIndex));
            if(lengthOfSubString == seen.size()){
                break;
            }
        }
        System.out.println("leftIndex: " + leftIndex + " rightIndex: " + rightIndex);
        return str.substring(leftIndex,rightIndex);
    }

    private static int subStringWithDistinctChar2(String str){
        int maxLength = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        int[] freq = new int[128];
        for(rightIndex = 0; rightIndex < str.length();rightIndex++){
            char currentChar = str.charAt(rightIndex);
            freq[currentChar]++;
            while (freq[currentChar] > 1) {
                char leftChar = str.charAt(leftIndex);
                freq[leftChar]--;
                leftIndex++;
            }
        }
        maxLength = Math.max(maxLength, rightIndex - leftIndex + 1);
        System.out.println(str.substring(leftIndex,rightIndex));
        System.out.println("leftIndex: " + leftIndex + " rightIndex: " + rightIndex);
        return maxLength;
    }
}
