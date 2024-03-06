package org.StringPrograms;

public class PrintUniqueCharacters {
    public static void main(String[] args) {
        String str = "This is a test";
        while (!str.isEmpty()) {
            String firstCharacter = str.charAt(0) + "";
            str = str.replace(firstCharacter + "", "");
            System.out.print(firstCharacter + ",");
        }
    }
}
