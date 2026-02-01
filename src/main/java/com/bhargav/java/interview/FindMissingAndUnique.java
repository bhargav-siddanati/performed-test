package com.bhargav.java.interview;

public class FindMissingAndUnique {
    public static void main(String[] args){
        // Find the unique element from the array
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        int result =  0;
        for(int ele : arr)
            result ^= ele;
        System.out.println("Find the unique element from the array : " + result);

        // Find the missing number from 1 to n
        int ar[] = {1,2,0,4};
        int x = 0;
        for(int i=1; i<=ar.length; i++){
            x ^= i;
            x ^= arr[i];
        }
        System.out.println("Missing unique number : " + x);
    }
}
