package com.example.codechallenge.codechallenges;

import java.sql.SQLOutput;

/**
 * @author juan.yee
 */
public class CodeChallenge22 {
    public static void main(String[] args) {
//        staircase(2);
//        staircase(4);
        staircase(6);
    }

    public static void staircase(int n) {
        for (int i=0; i<n; i++) {
            int spaces = (n - 1) - i;
            for (int j=0; j<spaces; j++) {
                System.out.print(" ");
            }
            int hashtags = n - spaces;
            for (int j=0; j<hashtags; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
