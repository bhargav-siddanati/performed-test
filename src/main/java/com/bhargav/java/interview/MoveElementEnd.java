package com.bhargav.java.interview;

import java.util.Arrays;

public class MoveElementEnd {
    public static void main(String[] args){
        int arr[] = {0,1,2,4,5,0,0,3,0,6,0,7};
        System.out.println(Arrays.toString(arr));
        moveElementToEnd(arr);
    }
    public static void moveElementToEnd(int[] arr){
        int k = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0)
                arr[k++] = arr[i];
        }
        while(k<arr.length){
            arr[k++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
