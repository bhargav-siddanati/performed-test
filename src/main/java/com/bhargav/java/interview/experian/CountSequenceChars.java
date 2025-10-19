package com.bhargav.java.interview.experian;

import java.util.Objects;

public class CountSequenceChars {
    public static void main(String[] args){
        System.out.println(countSquenceCharsInStr("aaabbccdde"));
        System.out.println(countSquenceCharsInStr("aabcaac"));
        System.out.println(countSquenceCharsInStr("abc"));
        System.out.println(countSquenceCharsInStr("babeqqwteweweee"));
    }
    public static String countSquenceCharsInStr(String s){
        if(Objects.isNull(s) || s.length()<=1) return s;
        int count = 1;
        String st = "";
        for(int i=0; i<s.length(); i++){
            if(i==s.length()-1){
                st = st + count + s.charAt(i);
                break;
            }
            if(s.charAt(i) != s.charAt(i+1)){
                st = st + count + s.charAt(i);
                count = 1;
            }else{
                count++;
            }
        }
        return st;
    }
}
