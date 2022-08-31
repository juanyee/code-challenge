package com.example.codechallenge;

import org.junit.Assert;

/**
 * @author juan.yee
 */
public class CodeChallenge3 {
    public static void main(String[] args) {
        // Given
        int n = 15;

        // When
        fizzBuzz(n);

        // Then
//        Assert.assertEquals("", "");
    }

    public static void fizzBuzz(int n) {
        if ( !(0 < n && n < 2*Math.pow(10,5)) ) {
            return;
        }

        for (int i=1; i<=n; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            } else if (i%3==0 && i%5!=0) {
                System.out.println("Fizz");
            } else if (i%3!=0 && i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
