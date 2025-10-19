package com.bhargav.java.interview.oracle;

public class Palindrom {
    public static void main(String[] args) {
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev));
    }
}
