package com.ds.poc.array.string;

import java.io.InputStream;
import java.util.Objects;
import java.util.stream.IntStream;

public class Palindrome {
    public static boolean inPalindrome(String arg) {
        if (Objects.nonNull(arg)) {
            for (int i=0 ; i < arg.length()/2 ; i++) {
                if (arg.charAt(i) != arg.charAt(arg.length() - i - 1)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("In Palindrom ? " + inPalindrome("acca"));
    }


}
