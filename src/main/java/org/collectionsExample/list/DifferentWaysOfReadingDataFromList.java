package org.collectionsExample.list;

import java.util.ArrayList;

public class DifferentWaysOfReadingDataFromList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayList.add(i);
        }
        arrayList.contains(141);

        //Using for each loop
        /*for (int i:arrayList) {
            System.out.println(i);
        }*/
        //Using for loop
       /* for(int i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }*/
        //using iterator
        /*Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
//            iterator.remove();
            System.out.println(iterator.next());
            System.out.println();
        }*/
        //Using list iterator
        /*ListIterator<Integer> integerListIterator = arrayList.listIterator();
        while (integerListIterator.hasNext()) {
            System.out.println(integerListIterator.next());
        }
        while (integerListIterator.hasPrevious()) {
            System.out.println(integerListIterator.previous());
        }*/
        //Using lambda expression
        /*arrayList.stream().forEach(e -> System.out.println(e));
        arrayList.forEach(System.out::println);
        arrayList.stream().forEach(System.out::println);*/
    }
}
