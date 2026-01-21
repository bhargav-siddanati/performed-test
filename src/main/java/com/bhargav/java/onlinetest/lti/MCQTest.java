package com.bhargav.java.onlinetest.lti;

import java.util.*;
import java.util.stream.Stream;

public class MCQTest {
    public static void main(String[] args){
        // 1
        StringBuilder sb = new StringBuilder("Java1");
        sb.append(" Programming");
        System.out.println(sb);

        // 2
        sb.insert(5,",");
        System.out.println(sb);

        // 3
        int x = 5;
        int y = 10;
        System.out.println(x>y?x:y);

        // 4
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(2);
        ls.add(1);
        ls.add(4);
        ls.add(5);
        ls.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2+o1;
            }
        });
        System.out.println(ls);
        /*List<Object> lo = ls;
        for(Object o : lo){
            System.out.print(o);
        }*/
        // Compile time error with Incompactiable types

        // 5
        Stream<String> stream = Stream.of("A","B","C","D");
        System.out.println(stream.peek(System.out::print).findAny().orElse("NA"));

        // 6
        String[] str = new String[5];
        str[2] = "Hello";
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        Optional<String> val = Optional.of(str[2]);
        System.out.println(val);

        // 7
        List<String> list = Arrays.asList("A", "B", "C");
        list.stream()
                .peek(System.out::print)
                .filter(s -> s.equals("B"))
                .findFirst();
  }
}
