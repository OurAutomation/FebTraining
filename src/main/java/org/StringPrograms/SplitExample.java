package org.StringPrograms;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String str = "My name is tutor";
        String[] s = str.split(" ");
        Arrays.stream(s).forEach(System.out::println);
    }
}
