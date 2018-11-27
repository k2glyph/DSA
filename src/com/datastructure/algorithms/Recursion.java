package com.datastructure.algorithms;

public class Recursion {
    public static int sumFromOneToN(int n) {
        if (n < 1) {
            return 0;
        }

        return n + sumFromOneToN(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sumFromOneToN(3));
        System.out.println(sumFromOneToN(3, 10));
        System.out.println(sumFromOneToNWhile(3));
    }
    public static int sumFromOneToN(int n, int a) {
        if (n < 1) {
            return a;
        }

        return sumFromOneToN(n - 1, a + n);
    }
    public static int sumFromOneToNWhile(int n) {
        int a = 0;

        while(n > 0) {
            a += n--;
        }

        return a;
    }
}