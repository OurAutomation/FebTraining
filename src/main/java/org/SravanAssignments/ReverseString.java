package org.SravanAssignments;

public class ReverseString {
    public static void main(String[] args) {
        String str = "This is a test";//tset a si siht
        String reverseString = "";
        String[] s= str.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            reverseString += s[i]+" ";
        }
        System.out.println(reverseString);

    }
}
