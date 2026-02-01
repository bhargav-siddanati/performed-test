package com.bhargav.java.interview.epam;

import java.util.ArrayDeque;

public class RemoveDuplicateCharFromString {
    static class Pair{
        char ch;
        int count;
        Pair(char ch, int count){
            this.ch = ch;
            this.count = count;
        }
    }
    public static void main(String[] args){
        String s = "aeksttdhoohdskpper";
        int k = 2;
        System.out.println(removeDuplicateChars(s, k));
    }
    private static String removeDuplicateChars(String s, int k){
        ArrayDeque<Pair> deque = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(!deque.isEmpty() &&  deque.peekLast().ch == c){
                deque.peekLast().count++;
                if(deque.peekLast().count == k){
                    deque.pollLast();
                }
            }
            else{
                deque.addLast(new Pair(c,1));
            }
        }
        StringBuilder result = new StringBuilder();
        for (Pair p : deque) {
            for (int i = 0; i < p.count; i++) {
                result.append(p.ch);
            }
        }

        return result.toString();


    }
}
