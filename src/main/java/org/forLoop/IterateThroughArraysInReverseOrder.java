package org.forLoop;

public class IterateThroughArraysInReverseOrder {
    static String strArr[] = {"abc", "bca", "dfe", "sdvs"};

    public static void main(String[] args) {
        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.println(strArr[i]);
        }
    }
}
