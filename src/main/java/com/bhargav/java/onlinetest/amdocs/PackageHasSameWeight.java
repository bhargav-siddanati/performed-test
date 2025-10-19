package com.bhargav.java.onlinetest.amdocs;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Map;


public class PackageHasSameWeight {
    public static void main(String[] args){
    System.out.println(sameWeightpackage(new int[] {3,5,9,9,5,3,5}));
    }
    public static int sameWeightpackage(int arr[]){
        if(arr.length <= 1) return -1;
        Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        if(isSameWeight(map)){
            return -1;
        }
    return map.entrySet().stream()
        .map(
            x -> {
              long value = x.getValue();
              int remain = (int) (value % 3);
              if (remain > 0 && remain <= 2) {
                System.out.println("Iam : " + x.getKey());
                return (int) (value / 3) + 1;
              }
              return (int) (value / 3);
            })
        .reduce(Integer::sum)
        .orElse(-1);
    }
    public static boolean isSameWeight(Map<Integer, Long> map){
        return map.entrySet().stream().anyMatch(x -> x.getValue() == 1);
    }
}
