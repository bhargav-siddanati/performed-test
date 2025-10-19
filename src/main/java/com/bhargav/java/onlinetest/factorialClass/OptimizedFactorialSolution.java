package com.bhargav.java.onlinetest.factorialClass;

import java.util.List;
import java.util.Map;

public class OptimizedFactorialSolution {
    public static int factorialSum(int array_length, List<Integer> arr) {
        // Write your code here

        //1. arrlength == list of size
        //2. loop the arr and validate each sum that sum is less then 10
        //3. factorial of sum value digits should present in the arr value

        if(array_length != arr.size()) return 0;

        Map<Integer, Integer> factorialMap = Map.of(1,1,
                2,4,
                3,9,
                4,24,
                5,120,
                6,720,
                7,720*7,
                8, 720*7*8,
                9, 720*7*8*9);
        for(int num : arr){
            int sum = sumOfDigitsOfNum(num);
            int factorialOfSum = factorialMap.get(sum);
            int count = countMatchingDigits(num, factorialOfSum);
            if(count >= 1) return num;
        }
        return 0;
    }
    public static int sumOfDigitsOfNum(int num){
        while(num > 9){
            num = String.valueOf(num).chars().map(Character::getNumericValue).sum();
        }
        return num;
    }
    public static int countMatchingDigits(int num, int factorial){
        String numStr = String.valueOf(num);
        String factStr = String.valueOf(factorial);
        int count = 0;
        for(int i=0; i<factStr.length(); i++){
            if(numStr.contains(String.valueOf(factStr.charAt(i)))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int result = factorialSum(3, List.of(122, 134, 154));
        System.out.println(result);
    }
}
