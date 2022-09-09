package com.example.codechallenge.cheatsheets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author juan.yee
 */
public class CheatSheet3 {

    /*
    * Loops determine a minimum or maximum value.
    * */
    public static void main(String[] args) {
        int[] listOfNumbers = {1, 1, 5, 3};

        utils(listOfNumbers);
        loop(listOfNumbers);
    }

    private static void utils(int[] listOfNumbers) {
        Integer[] arraysStream = Arrays.stream( listOfNumbers ).boxed().toArray( Integer[]::new );
        int maxNumber = Collections.max(Arrays.asList(arraysStream));
        System.out.println(maxNumber);

        List<Integer> list = Arrays.stream(listOfNumbers).boxed().collect(Collectors.toList());
        int maxNumber2 = Collections.max(list);
        System.out.println(maxNumber2);
    }

    private static void loop(int[] listOfNumbers) {
        int maxNumber = listOfNumbers[0];
        for (int i = 0; i < listOfNumbers.length; i++) {
            if (listOfNumbers[i] > maxNumber) {
                maxNumber = listOfNumbers[i];
            }
        }
        System.out.println(maxNumber);
    }
}
