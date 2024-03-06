package org.StringPrograms;

public class ReplaceSmallAlphabetsFromString {
    public static void main(String[] args) {
        String str = "This12 is 34 a Tes";
        //0-9 - numbers
        //A-Z - Capital Letters
        //a-z - small letters
//        str = str.replaceAll("[^0-9A-Z]", "");
        str = str.replaceAll("[a-z]", "");
        System.out.println(str);
    }
}
