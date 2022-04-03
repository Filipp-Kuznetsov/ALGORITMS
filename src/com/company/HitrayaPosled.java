package com.company;
import java.util.Scanner;
public class HitrayaPosled {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int[] fibArr = new int[n + 1];
        fibArr[0] = 0;
        fibArr[1] = 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; ++i) {
            if (i % 2 == 1) // ,a2n+2 = a2n+1–an,  a2n+1=a2n+2+an

                dp[i] =  dp[(i / 2)+ 1 ]+ 1 +dp[i / 2] ;
            else // a2n = an ­+ 1 (n>0), четное
                dp[i] = dp[i / 2] + 1;


        }
        System.out.println(dp[n]);
    }
}
