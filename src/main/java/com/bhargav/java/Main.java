package com.bhargav.java;

import java.util.Collections;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    /*System.out.println("Hello and welcome!");
        String s = "juliasamanthantjulia";
        System.out.println(s.indexOf("an*h"));

        Map<Integer, Integer> map = Map.of(1,2,2,3,4,5,6,77,7,34,567,456);
        Map<Integer, Integer> r = map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x,y) -> x, LinkedHashMap::new));
        r.entrySet().stream().forEach(System.out::print);
    System.out.println();
    Map<Integer, Integer> m = map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x,y) -> x, LinkedHashMap::new));
        m.entrySet().stream().forEach(System.out::print);*/
    String s1 = "abc";

    /*IntStream.range(0, s1.length())
        .forEach(
            i ->
                IntStream.range(i, s1.length())
                    .forEach(j -> System.out.println(s1.substring(i, j + 1))));*/

      //IntStream.range(0,10).peek(System.out::println).forEach( i -> System.out.print("---" + i));
      IntStream.range(0,10).peek(System.out::print).forEach( i -> System.out.print("---" + i + "\n"));

  }
}