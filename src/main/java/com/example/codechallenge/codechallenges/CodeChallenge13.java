package com.example.codechallenge.codechallenges;

import org.junit.Assert;

import java.util.*;

/**
 * @author juan.yee
 */
public class CodeChallenge13 {
    public static void main(String[] args) {

        Assert.assertEquals(1, numDuplicates(
                List.of("ball", "bat", "glove", "glove", "glove"),
                List.of(2, 3, 1, 2, 1),
                List.of(2, 5, 1, 1, 1)));

        Assert.assertEquals(0, numDuplicates(
                List.of("ball", "box", "lamp", "brick", "pumb"),
                List.of(2,2,2,2,2),
                List.of(2,2,2,2,2)));

        Assert.assertEquals(2, numDuplicates(
                List.of("ball", "box", "ball", "ball", "box"),
                List.of(2,2,2,2,2),
                List.of(1,2,1,1,3)));

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
        Set<Article> set = new HashSet<>();
        for (int i=0; i<name.size(); i++) {
//            set.add(name.get(i) + "|" + price.get(i) + "|" + weight.get(i));
            set.add(new Article(name.get(i), price.get(i), weight.get(i)));
        }
        return name.size() - set.size();
    }
}

class Article {
    private String name;
    private Integer price;
    private Integer weight;

    public Article(String name, Integer price, Integer weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(name, article.name) && Objects.equals(price, article.price) && Objects.equals(weight, article.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }
}
