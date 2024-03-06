package org.StringPrograms;

public class PrintTheCharactersAndItsRepetitionsIgnoreCaseSensitive {
    public static void main(String[] args) {
        String str = "This is a test";
        str = str.toLowerCase();
        while (!str.isEmpty()) {
            String firstCharacter = str.charAt(0) + "";
            int initialLength = str.length();
            str = str.replace(firstCharacter + "", "");
            int finalLength = str.length();
            System.out.println(firstCharacter + " :: " + (initialLength - finalLength));
        }
    }
}
