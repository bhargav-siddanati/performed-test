package com.bhargav.java.onlinetest.amdocs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfAdjacentSubArray {
    public static void main(String[] args){
    System.out.println(sumOfAdjSubArr(new int[] {1,5,0,1,0,2} ));
    }
    public static int sumOfAdjSubArr(int vaults[]){
        if (vaults == null || vaults.length == 0) return 0;
        if (vaults.length == 1) return vaults[0];

        int n = vaults.length;
        int[] dp = new int[n];

        // Base cases
        dp[0] = vaults[0];
        dp[1] = Math.max(vaults[0], vaults[1]);

        // Fill dp array
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + vaults[i]);
        }
        Arrays.stream(dp).forEach(System.out::println);
        return dp[n - 1];

    }
}
