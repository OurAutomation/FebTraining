package org.SravanAssignments;

public class UniqueCharacters {
    public static void main(String[] args) {
        String input = "hello world";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (input.indexOf(ch) == i) {
                System.out.print(ch);
            }

        }

    }
}
