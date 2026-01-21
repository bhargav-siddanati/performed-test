package com.bhargav.java.interview.epam;

import java.util.*;
import java.util.stream.Collectors;

public class StreamQuestion {
    public static void main(String[] args){
        String str = "this is a stream question";
    System.out.println(Arrays.toString(str.toCharArray()));
        LinkedHashMap<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
    }
}
