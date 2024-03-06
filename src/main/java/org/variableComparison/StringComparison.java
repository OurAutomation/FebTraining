package org.variableComparison;

public class StringComparison {
    static String a = "abc";
    static String b = "abc";
    static String c = new String("abc");

    public static void main(String[] args) {
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
