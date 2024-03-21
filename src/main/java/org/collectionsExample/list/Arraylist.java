package org.collectionsExample.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        /*int[] iarr = new int[1];
        iarr[5]=10;*/
        //Declaration Of Array List
       /* ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();*/

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(100);
        list.add(12345);
        list.add(123);
        list.add(1243);
        list.add(1237);
        list.add(1234);
        list.add(5123);
        list.add(18723);
        list.add(123);
        list.add(4,123);
        ArrayList abc = new ArrayList(list);
        System.out.println(list.get(4));
//        list.set(3, 45456);
        list.remove(2);
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.contains(1237));
        System.out.println(list.contains(1243));
        System.out.println(list.indexOf(1237));
        System.out.println(list.lastIndexOf(123));
        System.out.println("The size of the list is :: " + list.size());
        List<Integer> subList = new ArrayList<>();
        subList.add(45456);
        subList.add(123);
        subList.add(198);
        list.addAll(subList);
        System.out.println("The size of the list after adding is :: " + list.size());
        list.removeAll(subList);

        System.out.println("The size of the list after removing sublist is :: " + list.size());
        List<Integer> integers = list.subList(3, 5);
        System.out.println("Sublist start");
        for (int j : integers) {
            System.out.println(j);
        }
        System.out.println("Sublist end");
        System.out.println("Before sorting");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("reverse order");
        System.out.println(list);
        System.out.println("After sorting");
        Collections.sort(list);
        System.out.println(list);
        //to remove all elements in the list
        list.clear();
        System.out.println("The size after clear " + list.size());
    }
}
