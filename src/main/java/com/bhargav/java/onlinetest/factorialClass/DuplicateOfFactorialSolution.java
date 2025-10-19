package com.bhargav.java.onlinetest.factorialClass;

import java.util.*;
import java.util.stream.IntStream;

public class DuplicateOfFactorialSolution {
  public static int factorialSum(int array_length, List<Integer> arr) {
    // Write your code here

    // 1. arrlength == list of size
    // 2. loop the arr and validate each sum that sum is less then 10
    // 3. factorial of sum value digits should present in the arr value
    if (array_length != arr.size()) {
      return 0;
    }
    int result = 0;
    for (int num : arr) {
      String str = "" + num;
      System.out.println("initial: " + str);
      int ou = sumOftheValue(num);
      while (ou > 9) {
        ou = sumOftheValue(ou);
      }
      int factDup = IntStream.rangeClosed(1, ou).reduce(1, (a, b) -> a * b);

      String factStr = "" + factDup;
      int count = 0;

      for (int j = 0; j < factStr.length(); j++) {
        if (str.contains("" + factStr.charAt(j))) {
          count++;
        }
      }
      if (count > 1) {
        result = num;
        break;
      }
    }
    return result;
  }

  public static int sumOftheValue(int str) {
    String s = "" + str;
    return s.chars().map(Character::getNumericValue).sum();
  }

  public static void main(String[] args) {
    int result = factorialSum(3, List.of(122, 134, 154));
    System.out.println(result);
  }
}
