package org.StringPrograms;

public class AnagramExample {
    public static void main(String[] args) {
        String str = "bored1";
        String str1 = "robed";
        if (str.length() != str1.length()) {
            System.out.println("Not an anagram");
            System.exit(1);//to stop executing the program
        }
        boolean isAnagram = true;
        while (!str.isEmpty()) {
            String firstCharacter = str.charAt(0) + "";
            str = str.replace(firstCharacter, "");
            str1 = str1.replace(firstCharacter, "");
            if (str.length() != str1.length()) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("Given strings are anagram");
        } else {
            System.out.println("Given strings are not an anagram");
        }

        //dormitory
        //dirtyroom
    }
}
