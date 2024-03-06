package org.StringPrograms;

public class ReplaceAllAlphabetsFromString {
    public static void main(String[] args) {
        String str = "This12 is 34 a test12393948321874898127431287829483240193214";
        str = str.replaceAll("[^0-9]", "");
        System.out.println(str);
    }
}
