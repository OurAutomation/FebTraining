package org.StringPrograms;

public class PalindromeProgram {
    //String str="radar";
    //radar
    // class is class
    //class is not class not a palindrome
    public static void main(String[] args) {
        String str = "radar";
//        System.out.println(reverseTheGivenStringUsingCharArray(str));
        String reverse = new PalindromeProgram().reverseTheGivenString(str);
        if (reverse.equals(str)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }

    public String reverseTheGivenString(String str) {
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString = reverseString + str.charAt(i);
        }
        System.out.println(reverseString);
        return reverseString;
    }

    public static String reverseTheGivenStringUsingCharArray(String str) {
        String reverseString = "";
        char[] carr = str.toCharArray();
        for (char c : carr) {
            reverseString = c + reverseString;
        }
        System.out.println(reverseString);
        return reverseString;
    }
}
