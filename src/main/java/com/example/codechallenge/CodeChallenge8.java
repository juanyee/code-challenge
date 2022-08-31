package com.example.codechallenge;

import java.util.Scanner;

/**
 * @author juan.yee
 */
public class CodeChallenge8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.println(addTrailingWhitespaces(s1) + addLeadingZeroes(x));
        }
        System.out.println("================================");
    }

    private static String addTrailingWhitespaces(String value) {
        int missingSpaces = 15 - value.length();
        StringBuilder valueBuilder = new StringBuilder(value);
        for (int i = 0; i<missingSpaces; i++) {
            valueBuilder.append(" ");
        }
        value = valueBuilder.toString();
        return value;
    }

    private static String addLeadingZeroes(int num) {
        int missingZeroes = 3 - String.valueOf(num).length();
        StringBuilder response = new StringBuilder(String.valueOf(num));
        for (int i=0; i<missingZeroes; i++) {
            response.insert(0, "0");
        }
        return response.toString();
    }
}
