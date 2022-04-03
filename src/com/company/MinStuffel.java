package com.company;
import java.util.Scanner;
public class MinStuffel {
    public static void main(String[] args) {
        int a[] = { 2, 1, 3, 2, 1 };
        int n = a.length;
        System.out.print(minimum(a, n));
    }



    public static int minimum( int cost[],
                               int n){
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++)
        {
            dp[i] = Math.min(dp[i - 1],
                    dp[i - 2]) + cost[i];
        }

        // return the minimum
        return dp[n - 1];



    }
}
