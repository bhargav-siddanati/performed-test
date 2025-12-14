package com.bhargav.java.onlinetest;

import java.util.*;

public class LongestSubStringPalindrome {
    public static void main(String[] args){
        System.out.println(subStrPalindrom("babab"));
        System.out.println(subStrPalindrom("acdapmpomp"));
        System.out.println(subStrPalindrom("cbbd"));
    }
    public static String subStrPalindrom(String s){
        if(Objects.isNull(s) || s.length() <= 1) return s;
        if(s.length() == 2) return String.valueOf(s.charAt(0));
        int count = 0;
        Map<Integer, List<String>> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                String sub = s.substring(i, j);
                if(isPalindrom(sub)){
                    count = Math.max(count, sub.length());
                    map.computeIfAbsent(sub.length(), k -> new ArrayList<>()).add(sub);
                }
            }
        }
        System.out.println(count);
        System.out.println(map);
        return map.get(count).get(0);
    }
    public static boolean isPalindrom(String sub){
        return sub.equals(new StringBuilder(sub).reverse().toString());
    }
}
