package com.example.codechallenge.codechallenges;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author juan.yee
 */
public class CodeChallenge10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int r = a;
            for(int j=0; j<n; j++) {
                r += Math.pow(2, j) * b;
                if (j == n-1) {
                    System.out.println(r);
                } else {
                    System.out.print(r + " ");
                }
            }
        }
        in.close();
    }
}
