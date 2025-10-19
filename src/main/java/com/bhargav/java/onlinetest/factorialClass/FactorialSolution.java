package com.bhargav.java.onlinetest.factorialClass;

import java.util.*;


public class FactorialSolution {
    public static int factorialSum(int array_length, List<Integer> arr) {
        // Write your code here

        //1. arrlength == list of size
        //2. loop the arr and validate each sum that sum is less then 10
        //3. factorial of sum value digits should present in the arr value
        if(array_length != arr.size()){
            return 0;
        }
        int result = 0;
        int update = 0;
        for(int num : arr){
            String str = ""+num;
      System.out.println("initial: " + str);
            int ou = sumOftheValue(str);
            while(ou > 9){
                ou = sumOftheValue(""+ou);
            }



            int fact = 1;
            int factDup = ou;
            while(factDup != 1){
                fact *= factDup;
                factDup --;
            }

            String factStr = ""+fact;
            int count = 0;

            for(int j = 0; j < factStr.length(); j++){
                if(str.contains(""+factStr.charAt(j))){
                    count++;
                }
            }
            if(count > 0) {
                result = num;
                break;
            }

        }
        return result;
    }
    public static int sumOftheValue(String str){
    //System.out.println("sumOftheValue: "+str);
        int duplicate = 0;
        for(int i=0; i< str.length(); i++){
            duplicate += str.charAt(i) - '0';
                    // Character.getNumericValue(str.charAt(i));
                    //Integer.valueOf(str.charAt(i));
        }
        System.out.println("duplicate : " + duplicate);
        return duplicate;
    }

    public static void main(String[] args) {
        /* Scanner scan = new Scanner(System.in);

        int array_length = Integer.parseInt(scan.nextLine().trim());

        List<Integer> arr = new ArrayList<>(array_length);
        for(int j=0; j<array_length; j++) {
            arr.add(Integer.parseInt(scan.nextLine().trim()));
        } */


        int result = factorialSum(3, List.of(122,134, 154));

        System.out.println(result);
    }
}
