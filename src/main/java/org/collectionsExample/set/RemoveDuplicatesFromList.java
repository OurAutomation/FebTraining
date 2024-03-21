package org.collectionsExample.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12345);
        list.add(123);
        list.add(1243);
        list.add(12345);
        list.add(1237);
        list.add(123);
        list.add(1234);
        list.add(12345);
        list.add(1234);
        list.add(5123);
        list.add(18723);
        list.add(123);
        Set<Integer> abc = new HashSet<>(list);
//        System.out.println(abc);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int value = list.get(0);
            int firstIndex = list.indexOf(list.get(i));
            int lastIndex = list.lastIndexOf(list.get(i));
            while ( firstIndex!= lastIndex) {
                list.remove(lastIndex);
                lastIndex = list.lastIndexOf(list.get(i));
            }
            size = list.size();
        }
        System.out.println(list);
    }
}
