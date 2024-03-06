package org.StringPrograms;

public class PrintOnlySymbolsFromString {
    public static void main(String[] args) {
        String str = "This$12 is 3*4 a T()e(s";
        // We need to remove 0-9 A-Z a-z
        String str1 = str.replaceAll("[0-9A-Za-z]", "").replace(" ", "");
        System.out.println(str1);
        String str2 = str.replaceAll("[^0-9A-Za-z ]","");
        System.out.println(str2);
    }
}
