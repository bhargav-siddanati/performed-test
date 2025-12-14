package com.bhargav.java.onlinetest;

import java.util.*;

public class FindMaxProcessFromArray {
    public static void main(String[] args) {
        List<List<Integer>> round1 = new ArrayList<>();
        round1.add(List.of(0,2));
        round1.add(List.of(1,5));
        round1.add(List.of(0,9));

        List<List<Integer>> round2 = new ArrayList<>();
        round2.add(List.of(1,2));
        round2.add(List.of(2,5));
        round2.add(List.of(1,9));
        round2.add(List.of(0,10));
        round2.add(List.of(3,16));

        List<List<Integer>> round3 = new ArrayList<>();
        round3.add(List.of(2,6));
        round3.add(List.of(5,28));
        round3.add(List.of(3,4));
        round3.add(List.of(2,60));
        round3.add(List.of(1,26));
        round3.add(List.of(4,88));
        round3.add(List.of(0,99));
        round3.add(List.of(1,6));
        round3.add(List.of(4,2));


        System.out.println(findMaxProcess1(round1));
        System.out.println(findMaxProcess(round2));
        System.out.println(findMaxProcess(round3));
    }
    private static char findMaxProcess(List<List<Integer>> round){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int sub = 0;
        for(List<Integer> process : round){
            int c = (process.get(0));
            for(int i=1; i<process.size(); i++){
                int diff = process.get(i)-sub;
                if(Objects.nonNull(map.get(c))){
                    map.put(c, Math.max(map.get(c), diff));
                } else {
                    map.put( c,diff);
                }
                sub = process.get(i);
            }
        }
        map.entrySet().stream().forEach(x -> System.out.print(x.getKey() + " : " + x.getValue() + " -> "));
        Integer key = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst().get().getKey();
        System.out.println();
        return key == 0? 97: (char) (key + 97);
    }
    private static char findMaxProcess1(List<List<Integer>> rounds) {
        Map<Integer, Integer> maxUsageMap = new HashMap<>();
        int prevUsage = 0;

        for (List<Integer> process : rounds) {
            int processId = process.get(0);
            for (int i = 1; i < process.size(); i++) {
                int usageDiff = process.get(i) - prevUsage;
                maxUsageMap.merge(processId, usageDiff, Math::max);
                prevUsage = process.get(i);
            }
        }

        maxUsageMap.forEach((k, v) -> System.out.print(k + " : " + v + " -> "));
        System.out.println();

        int maxProcessId = Collections.max(
                maxUsageMap.entrySet(),
                Map.Entry.comparingByValue()
        ).getKey();

        return (char) ('a' + maxProcessId);
    }
}