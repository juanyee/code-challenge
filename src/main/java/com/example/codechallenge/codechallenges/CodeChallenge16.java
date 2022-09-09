package com.example.codechallenge.codechallenges;

import java.util.List;

/**
 * @author juan.yee
 */
public class CodeChallenge16 {
    public static void main(String[] args) {

    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // O(n)
        int aliceCounter = 0;
        int bobCounter = 0;
        for (int i=0; i<3; i++) {
            int ai = a.get(i);
            int bi = b.get(i);
            if (ai > bi) {
                aliceCounter++;
            } else if (ai < bi) {
                bobCounter++;
            }
        }
        return List.of(aliceCounter, bobCounter);
    }
}
