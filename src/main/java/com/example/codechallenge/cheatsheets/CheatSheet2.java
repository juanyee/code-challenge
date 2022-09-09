package com.example.codechallenge.cheatsheets;

/**
 * @author juan.yee
 */
public class CheatSheet2 {

    /*
    * Loops identify divisible integers
    * */
    public static void main(String[] args) {
        int divisor = 2;
        int dividend = 10;

        while (dividend >= divisor) {
            dividend -= divisor;
        }

        if (dividend == 0) {
            // then the dividend is divisible by the divisor
            System.out.println("yes is divisible");
        }
    }
}
