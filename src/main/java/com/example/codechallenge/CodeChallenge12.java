package com.example.codechallenge;

/**
 * @author juan.yee
 */
public class CodeChallenge12 {
    public static void main(String[] args) {
//        String s = "BZA";
        String s = "AZGB";
        long r = getTime(s);
        System.out.println(r);
    }

    private static String CIRCULAR_PRINTER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static long getTime(String s) {
        char from = 'A';
        long sum = 0;
        for (int i=0; i<s.length(); i++) {
            char to = s.charAt(i);
            sum += getCount(from, to);
            from = to;
        }
        return sum;
    }

    private static int getPosition(char value) {
        return CIRCULAR_PRINTER.indexOf(value);
    }

    private static long getCount(char from, char to) {
//        System.out.println("> " + getPosition(from));
//        System.out.println("> " + getPosition(to));
        /*
         * N -> 13
         * O -> 14 (12) -2
         * P -> 15 (11) -4
         * Q -> 16 (10) -6
         */
        long diff = Math.abs(getPosition(to) -getPosition(from));
        if (diff > 13) {
            diff = CIRCULAR_PRINTER.length() - diff;
        }
        return diff;
    }
}
