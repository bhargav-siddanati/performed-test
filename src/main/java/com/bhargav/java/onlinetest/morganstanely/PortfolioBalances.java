package com.bhargav.java.onlinetest.morganstanely;

import java.util.*;

public class PortfolioBalances {
    public static void main(String args[]){
        List<List<Integer>> round1 = new ArrayList<>();
        round1.add(List.of(1,2,10));
        round1.add(List.of(2,4,5));
        round1.add(List.of(3,5,12));

        List<List<Integer>> round2 = new ArrayList<>();
        round2.add(List.of(1,2,100));
        round2.add(List.of(2,5,100));
        round2.add(List.of(3,4,100));

        List<List<Integer>> round3 = new ArrayList<>();
        round3.add(List.of(2,3,608));
        round3.add(List.of(1,1,286));
        round3.add(List.of(4,4,882));

        System.out.println(maxValue(5,round1));
        System.out.println(maxValue(5,round2));
        System.out.println(maxValue(4,round3));

    }
    public static long maxValue(int n, List<List<Integer>> rounds){
        long[] arr = new long[n];

        for(List list : rounds){
            int start = (int)list.get(0) -1;
            int end = (int)list.get(1) -1;
            int value = (int)list.get(2);
            for(int i=start; i<=end && i<arr.length; i++)
                arr[i] += value;
        }
        long maxCount = arr[0];
        for(int i=1; i<arr.length; i++){
            maxCount = Math.max(maxCount, arr[i]);
        }
        return maxCount;
    }
}
