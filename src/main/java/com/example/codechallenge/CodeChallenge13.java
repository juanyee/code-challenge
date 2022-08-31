package com.example.codechallenge;

import java.util.*;

/**
 * @author juan.yee
 */
public class CodeChallenge13 {
    public static void main(String[] args) {
//        List<String> nameList = List.of("ball", "bat", "glove", "glove", "glove");
//        List<Integer> priceList = List.of(2, 3, 1, 2, 1);
//        List<Integer> weightList = List.of(2, 5, 1, 1, 1);

        List<String> nameList = List.of("ball", "box", "ball", "ball", "box");
        List<Integer> priceList = List.of(2,2,2,2,2);
        List<Integer> weightList = List.of(1,2,1,1,3);

//        List<String> nameList = List.of("ball", "box", "lamp", "brick", "pumb");
//        List<Integer> priceList = List.of(2,2,2,2,2);
//        List<Integer> weightList = List.of(2,2,2,2,2);

        int r = numDuplicates(nameList, priceList, weightList);
        System.out.println(r);
    }

    public static int numDuplicates(List<String> name, List<Integer> price, List<Integer> weight) {
//        // first approach
//        int duplicates = 0;
//        List<String> elements = new ArrayList<>();
//        for (int i=0; i<name.size(); i++) {
//            String joinedString = name.get(i) + "|" + price.get(i) + "|" + weight.get(i);
//            if (elements.contains(joinedString)) {
//                duplicates++;
//            } else {
//                elements.add(joinedString);
//            }
//        }
//        return duplicates;

        // second approach
        Set<String> set = new HashSet<>();
        for (int i=0; i<name.size(); i++) {
            set.add(name.get(i) + "|" + price.get(i) + "|" + weight.get(i));
        }
        return name.size() - set.size();
    }
}

//class Joined {
//    private String name;
//    private Integer price;
//    private String weight;
//}
