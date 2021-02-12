package com.ds.poc.array.string;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {
    public static boolean inAnagram(String word1, String word2) {
            List<String> list1 = Arrays.asList(word1.split(""));
            List<String> list2 = Arrays.asList(word2.split(""));
            if (list1.size() == list2.size()) {
                list1.sort(String::compareToIgnoreCase);
                list2.sort(String::compareToIgnoreCase);
                System.out.println(list1);
                System.out.println(list2);
                if (list1.toString().equalsIgnoreCase(list2.toString())) {
                    return true;
                }
            }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Is Anagram ? " + inAnagram("Rat", "Art"));
    }
}
