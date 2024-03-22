package org.SravanAssignments;

import java.security.Key;

public class Repetition {
    public static void main(String[] args) {
        String input = "hello world";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) == ch) {
                    System.out.print(ch);
                }
            }

        }
    }
}
