package com.bhargav.java.onlinetest;

import java.util.*;

public class PermutationsCombination {
    public static void main(String[] args){
        String input = "abc";
        Set<String> combinations = generateCombinations(input);
        System.out.println("Combinations:");
        for (String s : combinations) {
            System.out.println(s);
        }

    }
    public static Set<String> generateCombinations(String input) {
        Set<String> result = new LinkedHashSet<>();
        int n = input.length();

        // 1. Add individual characters
        for (int i = 0; i < n; i++) {
            result.add(String.valueOf(input.charAt(i)));
        }

        // 2. Add contiguous substrings of length 2 to n
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                result.add(input.substring(i, i + len));
            }
        }

        // 3. Add all permutations of length 2 to n
        /*for (int len = 2; len <= n; len++) {
            permute("", input, len, result);
        }*/

        return result;
    }
    private static void permute(String prefix, String remaining, int targetLength, Set<String> result) {
        if (prefix.length() == targetLength) {
            result.add(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            String newPrefix = prefix + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            permute(newPrefix, newRemaining, targetLength, result);
        }
    }

}
