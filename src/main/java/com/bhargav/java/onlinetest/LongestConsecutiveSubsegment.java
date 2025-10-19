package com.bhargav.java.onlinetest;

import java.util.*;

public class LongestConsecutiveSubsegment {
  public static int countMaxConsecutiveOnesWays(String s, int k) {
    int n = s.length();
    int left = 0, right = 0, zeroCount = 0;
    int maxLen = 0;
    Set<String> uniqueWays = new HashSet<>();

    while (right < n) {
      if (s.charAt(right) == '0') zeroCount++;
      while (zeroCount > k) {
        if (s.charAt(left) == '0') zeroCount--;
        left++;
      }
      int currentLen = right - left + 1;
      if (currentLen > maxLen) {
        maxLen = currentLen;
        uniqueWays.clear();
        uniqueWays.add(left + "-" + right);
      } else if (currentLen == maxLen) {
        uniqueWays.add(left + "-" + right);
      }
      right++;
    }

    return uniqueWays.size();
  }

  public static void main(String[] args) {
    String s1 = "1010101";
    int k1 = 1;
    System.out.println(countMaxConsecutiveOnesWays(s1, k1)); // Output: 3

    /*String s2 = "01010";
    int k2 = 3;
    System.out.println(countMaxConsecutiveOnesWays(s2, k2)); // Output: 1

    String s3 = "10100101110110";
    int k3 = 3;
    System.out.println(countMaxConsecutiveOnesWays(s3, k3)); // Output: 1*/
  }
}
