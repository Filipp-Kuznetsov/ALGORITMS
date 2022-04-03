package com.company;
import java.util.Scanner;
public class Cherepaha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] road = new int[n][m];

        for (int i = 0; i <n ; i++) {
            road[i][0]=1;
        }
        for (int i = 0; i <m ; i++) {
            road[0][i]=1;
        }
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <m ; j++) {
                road[i][j]=road[i-1][j]+road[i][j-1];
            }
        }
        System.out.println(road[n-1][m-1]);
    }
}
