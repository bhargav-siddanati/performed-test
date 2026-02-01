package com.bhargav.java.interview.epam;

import java.util.*;
import java.util.stream.IntStream;

public class ArranageElementsInPairs {
    public static void main(String[] args){
        int arr[] = {6,-1,1,-3,3,2,-2,2,1,-1,3,-2,-4,-3,-5,-1,4,5,-2};
        System.out.println(Arrays.deepToString(arrangeInPairs(arr)));
    }
    private static int[][] arrangeInPairs(int[] arr){
        Set<Integer> positive = new LinkedHashSet<>();
        int i=0;
        int j=1;
        while(i<arr.length && j<arr.length){
            if(!positive.contains(arr[i]) && Math.abs(arr[i]) == Math.abs(arr[j]) ){
                if(arr[i]>arr[j]){
                    positive.add(arr[j]);
                    positive.add(arr[i]);
                }
                else{
                    positive.add(arr[i]);
                    positive.add(arr[j]);
                }
                i++;
                j++;
            }
            else if(j == arr.length-1){
                i++;
                j = i+1;
            }
            else
                j++;
        }
        System.out.println("List: " + positive);
        List<Integer> list = new ArrayList<>(positive);
        return IntStream.range(0, list.size()/2)
                .mapToObj(k -> new int[]{list.get(2*k), list.get(2*k+1)})
                .toArray(int[][]::new);
    }
}
