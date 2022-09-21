package com.example.codechallenge.codechallenges;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * @author juan.yee
 */
public class CodeChallenge20 {
    public static void main(String[] args) {
        plusMinus(List.of(-4, 3, -9, 0, 4, 1));
    }

    public static void plusMinus(List<Integer> arr) {
        long n = arr.size();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (Integer i : arr) {
            if (i > 0) positive++;
            else if (i < 0) negative++;
            else zero++;
        }
        System.out.println(new BigDecimal((double)positive/n).setScale(6, RoundingMode.HALF_UP));
        System.out.println(new BigDecimal((double)negative/n).setScale(6, RoundingMode.HALF_UP));
        System.out.println(new BigDecimal((double)zero/n).setScale(6, RoundingMode.HALF_UP));
    }
}
