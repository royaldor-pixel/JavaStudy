package com.javabasic.arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        char[] vowels = {'e','u','o','i','a'};
        int startingIndex = 1;
        int endingIndex = 3;
        Arrays.sort(vowels, startingIndex, endingIndex);
        System.out.println(Arrays.toString(vowels));
    }
}
