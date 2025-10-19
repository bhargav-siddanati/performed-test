package com.bhargav.java.onlinetest.amdocs;

import java.util.*;

public class LargestSumsubArray {
  public static void main(String[] args) {
    System.out.println(sumOfSubArray(new int[] {1, 2, 3, 4}));
  }

  public static int sumOfSubArray(int arr[]) {
    if (arr.length == 0) return -1;
    if (arr.length == 1) return arr[0];

    int arrSum = Arrays.stream(arr).reduce(Integer::sum).getAsInt();
//    List<Integer> set = new ArrayList<>();
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      int count = arr[i];
      for (int j = i + 1; j < arr.length; j++) {
         count += arr[j];
         max = Math.max(max, count);
         //set.add(count);
        //System.out.println(count+ "  " + arr[j]);
      }
    }
    //int sub = set.stream().sorted(Comparator.reverseOrder()).distinct().findFirst().get();
    return Math.max(max, arrSum);//arrSum > sub?arrSum:sub;
  }
}
