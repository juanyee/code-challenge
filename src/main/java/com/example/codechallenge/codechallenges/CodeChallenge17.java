package com.example.codechallenge.codechallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author juan.yee
 */
public class CodeChallenge17 {
    public static void main(String[] args) {
//        List<Integer> a = List.of(2, 6);
//        List<Integer> b = List.of(24, 36);
//        List<Integer> a = List.of(2, 4);
//        List<Integer> b = List.of(16, 32, 96);
        List<Integer> a = List.of(3, 4);
        List<Integer> b = List.of(24, 48);

        System.out.println(getTotalX(a, b));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int counter = 0;
        for (int i = a.get(a.size()-1); i <= b.get(0); i++) {
            boolean flag1 = true;
            boolean flag2 = true;
            for (Integer integer : a) {
                if(i % integer != 0) flag1 = false;
            }
            for (Integer integer : b) {
                if(integer % i != 0) flag2 = false;
            }
            if(flag1 && flag2) counter ++;
        }
        return counter;
    }
}
