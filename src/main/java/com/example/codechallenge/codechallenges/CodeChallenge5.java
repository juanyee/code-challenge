package com.example.codechallenge.codechallenges;

import org.junit.Assert;

import java.util.Scanner;

/**
 * @author juan.yee
 */
public class CodeChallenge5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (!(1 <= N && N <= 100)) {
            return;
        }

        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N%2 == 0) {
            if (2<=N && N<=5) {
                System.out.println("Not Weird");
            } else if (6<=N && N<=20) {
                System.out.println("Weird");
            } else if (20<N) {
                System.out.println("Not Weird");
            }
        }

        scanner.close();
    }
}
