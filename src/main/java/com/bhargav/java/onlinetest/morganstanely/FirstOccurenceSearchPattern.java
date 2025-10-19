package com.bhargav.java.onlinetest.morganstanely;

import java.util.Objects;

public class FirstOccurenceSearchPattern {
    public static void main(String[] args){
        System.out.println(firstOccurrence("xabcdey" , "ab*de"));
        System.out.println(firstOccurrence("juliasamanthantjulia" , "ant"));
        System.out.println(firstOccurrence("juliasamanthasamanthajulia" , "has"));
        System.out.println(firstOccurrence("juliasamanthasamanthajulia" , "ant*as"));
    }
    public static int firstOccurrence(String text, String searchPattern){
        int n = text.length();
        int len = searchPattern.length();

        if(Objects.isNull(text) || Objects.isNull(searchPattern) || n==0 || len==0) return -1;
        if(n==1 && len == 1){
            if(searchPattern.charAt(0) == '*') return 0;
            return text.charAt(0) == searchPattern.charAt(0)? 0 : -1;
        }
        if(n==1 && len>1) return -1;
        if(!searchPattern.contains("*")){
            return text.indexOf(searchPattern);
        }
        int i=0, j=0;
        int index = -1;
        while(i<n && j<len){
            if(text.charAt(i) == searchPattern.charAt(j) || searchPattern.charAt(j) == '*'){
                if(j == 0) index = i;
                i++;
                j++;
            }
            else{
                index = -1;
                i++;
                j=0;
            }
        }
        return index;
    }
}
