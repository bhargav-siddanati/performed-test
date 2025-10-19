package com.bhargav.java.interview.accenture.java;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamInterview {
    public static void main(String[] args) {
        String str = "BharatKumar";
        Map<Character, Long> map = str.chars().mapToObj(ch -> (char)ch).collect(
                Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
