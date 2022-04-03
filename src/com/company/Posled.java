package com.company;
import java.util.Scanner;
public class Posled {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N: ");
        int n= sc.nextInt();
        int []fibArr= new int[n+1];
        fibArr[0]=0;
        fibArr[1]=1;
        //fibArr[2]=2;
        for (int i = 2; i <=n; ++i) {
            if (i%2==1){//для нечётного значения
                fibArr[i]=fibArr[i/2]-fibArr[i/2-1];
            }else{//для чётного значения
                fibArr[i]=fibArr[i/2]+fibArr[i/2-1];
            }
            System.out.println(fibArr[i]);
        }

       /* int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; ++i){
            if (i % 2 == 1) // ,a2n+1 = an – an-1,
                dp[i] = dp[i / 2] - dp[i / 2 - 1];
            else // a 2n = an + an-1
                dp[i] = dp[i / 2] + dp[i / 2 - 1];

        }
        System.out.println(dp[n]);
        
        */

    }





}
