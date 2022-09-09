package com.example.codechallenge.cheatsheets;

/**
 * @author juan.yee
 */
public class CheatSheet1 {
    /*
    * Loops identify digits in a number
    * */
    public static void main(String[] args) {
        int number = 123;
        while (number > 0) {
            int digit = number % 10;
            number /= 10; // take the ones digit off the number
            System.out.println(digit);
            System.out.println(number);
        }
    }
}
