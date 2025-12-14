package com.bhargav.java.onlinetest.lti;

import java.util.Arrays;
import java.util.stream.Stream;

public class OnlineTest {
  public static void main(String[] args) {
    System.out.println("================ Welcome to LTI Online Test ================");
    int[] arr = {5, 2, 8, 1, 3};
    Arrays.sort(arr);
    System.out.println("Find the element in the array : " + Arrays.binarySearch(arr, 3));
    System.out.println("Interitance Test");
    Parent p = new Child();
    p.className();
    System.out.println("Streams test");
    Stream<String> str = Stream.of("A", "B", "C", "D");
    System.out.println(str.peek(System.out::print).findAny().orElse("NA"));

    String s1 = "james";
    StringBuffer s2 = new StringBuffer("james");
    StringBuilder s3 = new StringBuilder("james");
    System.out.println(s1==s2.toString());
    System.out.println(s1==s3.toString());
    System.out.println("================ Test Completed ================");
  }
}

class Parent {
  public void className() {
    System.out.println("Parent class");
  }
}

class Child extends Parent {
  void ClassName() {
    System.out.println("Child class");
  }
}
