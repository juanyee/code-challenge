package com.example.codechallenge.codechallenges;

import java.util.Scanner;

/**
 * @author juan.yee
 */
public class CodeChallenge14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // approach 1
        // int a = Integer.parseInt(scanner.next().split(" = ")[1]);
        // int b = Integer.parseInt(scanner.next().split(" = ")[1]);
        // System.out.println(a + b);

        // approach 2
        int a = scanner.nextInt(); // O(1)
        int b = scanner.nextInt(); // O(1)
        System.out.println(a + b); // O(1)
        // O(1)    }
    }
}
