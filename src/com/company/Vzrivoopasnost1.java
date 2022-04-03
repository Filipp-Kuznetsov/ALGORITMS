package com.company;
import java.util.Scanner;
public class Vzrivoopasnost1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scanner.nextInt();
        int [] container = new int[n+1];


        container[1]=2;
        container[2]=3;
        for (int i = 2; i <=n; i++) {
            container[i] = container[i-1] + container[i-2];

        }
        System.out.println(container[n]);
    }
}
