package org.io_operations;

import java.util.ArrayList;

public class ArrayListOfArrayList {
    public static void main(String[] args) {
        // Create an ArrayList to hold ArrayLists of integers
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();

        // Create and add some inner ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(7);
        list3.add(8);
        list3.add(9);

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        // Access elements in the ArrayList of ArrayLists
        System.out.println("Elements in the ArrayList of ArrayLists:");
        for (ArrayList<Integer> list : listOfLists) {
            for (Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
