package org.errors;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(;;) {
            list.add("str");
        }
    }
}
