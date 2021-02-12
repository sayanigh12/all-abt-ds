package com.ds.poc.array.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word : ");
        String input = sc.next();
        System.out.println("(Using nested loop)It's a unique character String : " + isUnique(input));
        System.out.println("(Using SET) It's a unique character String : " + isUniqueWithSet(input));
        System.out.println("(Using 128 array) It's a unique character String : " + isUniqueWith128Array(input));
        System.out.println("(Using Bit Operator) It's a unique character String : " + isUniqueWithBitOper(input));
    }

    private static boolean isUniqueWithBitOper(String input) {
        // yet to be done
        return false;
    }

    private static boolean isUniqueWith128Array(String input) {
        boolean[] arr = new boolean[128];
        for (int i = 0; i < input.length() ; i++) {
            if (!arr[input.charAt(i)]) {
                arr[input.charAt(i)] = true;
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean isUniqueWithSet(String input) {
        String[] strArr = input.split("");
        Set<String> strSet = new HashSet<String>(Arrays.asList(strArr));
        if (strArr.length != strSet.size()) {
            return false;
        }
        return true;
    }

    private static boolean isUnique(String input) {
        int wordLen = input.length();
        for (int i=0 ; i < wordLen ; i++) {
            for (int j = i + 1 ; j < wordLen; j ++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

}
