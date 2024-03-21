package org.exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorHandling {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(;;) {
            try {
                list.add("str");
            } catch (OutOfMemoryError e) {
               break;
            }
        }
        System.out.println("Total elements in the list :: " + list.size());
    }
}
