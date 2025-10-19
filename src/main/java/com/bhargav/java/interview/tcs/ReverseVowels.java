package com.bhargav.java.interview.tcs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseVowels {
    public static void main(String[] args){
        reversedVowels("Education");
        reversedVowels("laptop");
        reversedVowels("somnath");
        vowels("Education");
        vowels("laptop");
        vowels("somnath");
    }
    public static void reversedVowels(String s){
        String st = s.toLowerCase();
        char[] arr = st.toCharArray();
        int i=0, j=st.length()-1;
        while(i!=j){
            boolean left = isVowel(st.charAt(i));
            boolean right = isVowel(st.charAt(j));
            if(left && right){
                arr[i] = st.charAt(j);
                arr[j] = st.charAt(i);
                i++;
                j--;
                continue;
            }
            if(!left && i<j) i++;
            if(!right && i<j) j--;
        }
    System.out.println(arr);
  }

    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void vowels(String s){
        String st = s.toLowerCase();
        char[] arr = st.toCharArray();
        Deque<Character> ch = IntStream.range(0, arr.length)
                .map(i -> arr.length-1-i)
                .mapToObj(c -> arr[c])
                .filter(i -> isVowel(i))
                .collect(Collectors.toCollection(ArrayDeque::new));
        //System.out.println(ch);
        for(int j=0; j<arr.length; j++){
            if(isVowel(arr[j])){
                arr[j] = ch.remove();
            }
        }
        System.out.println(arr);
    }
}
