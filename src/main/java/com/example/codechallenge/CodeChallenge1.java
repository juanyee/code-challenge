package com.example.codechallenge;

import org.junit.Assert;

import java.util.List;

/**
 * @author juan.yee
 */
public class CodeChallenge1 {
    public static void main(String[] args) {
// Given
        int x = 12321;
        boolean expected = true;

        // When
//        boolean output = isPalindrome1(x);
        boolean output = isPalindrome2(x);

        Assert.assertEquals(expected, output);
    }

    /*
     * Given an integer x, return true if x is palindrome integer.
     * An integer is a palindrome when it reads the same backward as forward.
     * For example, 121 is a palindrome while 123 is not.
     * */
    public static boolean isPalindrome1(int x) {
        if (!(Math.pow(-2, 31) < x && x < Math.pow(2, 31) - 1)) {
            return false;
        }

        String temp = Integer.toString(x);
        int[] intArray = new int[temp.length()];
        for (int i=0; i<temp.length(); i++) {
            intArray[i] = temp.charAt(i) - '0';
        }

        for (int i = 0; i < (intArray.length/2) + 1; i++) {
            int left = intArray[i];
            int right = intArray[intArray.length-(i+1)];
            if(left!=right) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;
    }
}
