package com.bhargav.java.interview.oracle;

public class ReverseString {
    public static void main(String[] args) {
        String str = "bhargav";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        int size = str.length();
        String rev = "";
        for(int i=size-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
