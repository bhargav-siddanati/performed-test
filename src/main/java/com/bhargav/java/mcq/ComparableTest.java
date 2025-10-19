package com.bhargav.java.mcq;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparableTest {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(25);
    list.add(30);
    list.add(28);
    list.add(35);
    list.add(20);
    list.sort(
        new Comparator<Integer>() {
          public int compare(Integer a, Integer b) {
            return a + b;
          }
        });
    // The below code will throw java.lang.IllegalArgumentException: Comparison method violates its
    // general contract!
    /*List<Object> b = list;
    System.out.println(b);*/
  }
}
