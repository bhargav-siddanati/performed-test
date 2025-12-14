package com.bhargav.java.interview.myCargoGateAG;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateInSameOrderIndex {
  public static List<Integer> findDuplicate(int[] arr) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    List<Integer> list = new ArrayList<>();
    for (int num : arr) {
      if (set1.contains(num)) {
        if (!set2.contains(num)) {
          list.add(num);
          set2.add(num);
        } else {
          list.add(num);
        }
      } else {
        set1.add(num);
      }
    }
    return list;
  }

  public static List<Integer> findDuplicatesInOrder(int[] arr) {
    Set<Integer> set = new HashSet<>();
    List<Integer> list = new ArrayList<>();
    for (int num : arr) {
      if (set.contains(num)) {
        System.out.println("Element in list: " + num);
        list.add(num);
      } else {
        System.out.println("Element in set: " + num);
        set.add(num);
      }
    }
    System.out.println(set);
    return list;
  }

  public static void main(String[] args) {
    int[] a = new int[] {1, 2, 3, 4, 2, 3, 4, 5, 6, 5};
    int[] b = new int[] {1, 2, 1, 3, 4, 5, 2, 1, 3, 5};
    int[] c = new int[] {1, 2, 3};
    //    System.out.println(findDuplicatesInOrder(a));
    //    System.out.println(findDuplicate(a));
    //    System.out.println(findDuplicatesInOrder(b));
    //    System.out.println(findDuplicatesInOrder(c));
    List<Integer> unique = Arrays.stream(a).boxed()
            .collect(Collectors.groupingBy(i->i, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(m -> m.getValue() == 1)
            .map(key -> key.getKey())
            .collect(Collectors.toList());

      List<Integer> dup = Arrays.stream(a).boxed().collect(Collectors.toList());
      dup.removeAll(unique);
    System.out.println(dup);
  }
}
