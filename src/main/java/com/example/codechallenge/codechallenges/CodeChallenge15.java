package com.example.codechallenge.codechallenges;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author juan.yee
 */
public class CodeChallenge15 {
    public static void main(String[] args) {
        System.out.println(simpleArraySum(List.of(1, 2, 3)));
    }

    public static int simpleArraySum(List<Integer> ar) {
//        return ar.stream().mapToInt(e -> e).sum();
        return ar.stream().mapToInt(Integer::intValue).sum();
//        return ar.stream().reduce(0, Integer::sum);
//        return ar.stream().collect(Collectors.summingInt(Integer::intValue));
    }
}
