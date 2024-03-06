package org.StringPrograms;

public class PrintTheCharactersAndItsRepetitions {
    public static void main(String[] args) {
        String str = "This is a test";
        while (!str.isEmpty()) {
            String firstCharacter = str.charAt(0) + "";
            int initialLength = str.length();
            str = str.replace(firstCharacter + "", "");
            int finalLength = str.length();
            System.out.println(firstCharacter + ":: " + (initialLength - finalLength));
        }
    }
}
