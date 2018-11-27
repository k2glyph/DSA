package com.datastructure.algorithms;

public class FinallyWithOutCatch {
    public static void main(String[] args) {
        try{
            FinallyWithOutCatch.divide(0, 10);}
        finally{
            System.out.println("finally in main");
        }
    }
    public static void divide(int n, int div){
        try{
            int ans = n/div; }
        finally{
            System.out.println("finally of divide");
        }
    }
}
