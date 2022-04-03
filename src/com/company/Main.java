package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

                int k=in.nextInt();
                int f=  fibonacciValue(k);
                System.out.println(f);

        int x=  getFibArray(k);
        System.out.println(x);
            }

            public static int fibonacciValue(int n) {   //f(n) = f(n-1) + f(n-2)
                if (n <= 2) {
                    return 1;
                }
                return (fibonacciValue(n - 1) + fibonacciValue(n - 2));
            }
    public static int getFibArray(int n){
        int[] fibArr = new int[n+1];
        fibArr[0] = 0;
        fibArr[1] = 2;
        fibArr[2] = 3;

        for (int i = 3; i <= n; i++) {
            fibArr[i] = fibArr[i-1] + fibArr[i-2];
        }
        return  fibArr[n];
    }

        }






//public static long task1(int n) {   //f(n) = f(n-1) + f(n-2)
//        if (n <= 1) {
//            return n;
//        }
//                return (task1(n - 1) + task1(n - 2));
//    }



