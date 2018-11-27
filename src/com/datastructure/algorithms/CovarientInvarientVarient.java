package com.datastructure.algorithms;

import java.util.Arrays;
import java.util.List;

public class CovarientInvarientVarient {
    public static void main(String[] args) {
        List<Long> longs = Arrays.asList(42L, 128L, -10L);
        double sumOfLongs = sum(longs);
        System.out.println(sumOfLongs);
    }
    public static double sum(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }



}
