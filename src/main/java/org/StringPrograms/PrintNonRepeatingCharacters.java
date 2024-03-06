package org.StringPrograms;

public class PrintNonRepeatingCharacters {
    public static void main(String[] args) {
        String str = "This is a test";
        while (!str.isEmpty()) {
            String firstCharacter = str.charAt(0) + "";
            int initialLength = str.length();
            str = str.replace(firstCharacter + "", "");
            int finalLength = str.length();
            if (initialLength - finalLength == 1) {
                System.out.print(firstCharacter + ",");
            }
        }
    }
}
