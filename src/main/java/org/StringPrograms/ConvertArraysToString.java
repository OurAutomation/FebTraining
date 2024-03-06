package org.StringPrograms;

public class ConvertArraysToString {
    static String[] strArr = {"today", "is", "a", "holiday"};

    public static void main(String[] args) {
       /* String str = "";
        for (String s : strArr) {
            str += s + " ";
        }
        System.out.println(str);*/
//        System.out.println(String.join(".///",strArr));
        System.out.println(String.join(" ", strArr));
    }
}
