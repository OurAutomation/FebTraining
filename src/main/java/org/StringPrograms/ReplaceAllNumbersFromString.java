package org.StringPrograms;

public class ReplaceAllNumbersFromString {
    public static void main(String[] args) {
        String str = "This12 is 34 a test12393948321874898127431287829483240193214";
        /*str = str.replace("0", "");
        str = str.replace("1", "");
        str = str.replace("2", "");
        str = str.replace("3", "");
        str = str.replace("4", "");*/
        str = str.replaceAll("\\d+", "");
        System.out.println(str);
    }
}
