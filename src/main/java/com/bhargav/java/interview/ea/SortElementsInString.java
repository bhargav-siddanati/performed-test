package com.bhargav.java.interview.ea;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortElementsInString {
  public static void main(String[] args) {
    String str = "dcba";
    char arr[] = str.toCharArray();
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          char temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println(String.valueOf(arr));

    List<Character> list = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
    Collections.sort(list);
    StringBuilder sb = new StringBuilder();
    for (Character ch : list) {
      sb.append(ch);
    }
    System.out.println(sb);
  }
}
