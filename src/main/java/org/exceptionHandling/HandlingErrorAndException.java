package org.exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class HandlingErrorAndException {
    public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<>();
            for (; ; ) {
                list.add("str1231421413221343213214213412314221421323234231432142314321432432143232");
            }
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        /*catch (Exception | Error e) {
            System.out.println(e.getMessage());
        }*/
        System.out.println("Program completed");
    }
}
