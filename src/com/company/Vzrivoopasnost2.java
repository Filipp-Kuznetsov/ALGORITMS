package com.company;

import java.util.Scanner;

public class Vzrivoopasnost2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int[] container = new int[n + 1];
        container[0] = 0;
        container[1] = 3;
        container[2] = 8;
        //container[3] = ;
        for (int i = 4; i <=n ; i++) {
            container[i]=container[i-1]+container[i-2]+container[i-3];
        }
        System.out.println(container[n]);

    }
}
