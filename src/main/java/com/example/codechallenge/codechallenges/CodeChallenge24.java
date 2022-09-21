package com.example.codechallenge.codechallenges;

/**
 * @author juan.yee
 */
public class CodeChallenge24 {
    public static void main(String[] args) {
        SerialMultiplier result = new SerialMultiplier(9);
        System.out.println(result);
    }
}

class SerialMultiplier {
    int first=1, second=1, third=1, fourth=1, fifth=1;

    public SerialMultiplier (int first) {
        this.first = first;
    }

    public SerialMultiplier (int first, int second) {
        this.first = first;
        this.second = second;
    }

    public SerialMultiplier (int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public SerialMultiplier (int first, int second, int third, int fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public SerialMultiplier (int first, int second, int third, int fourth, int fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
    }

    @Override
    public String toString() {
        return String.valueOf(first * second * third * fourth * fifth);
    }
}
