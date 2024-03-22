package org.SravanAssignments;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsAssignment {
    public static void main(String[] args) {
        Date a = new Date();
        HashSet h = new HashSet();
        for (int i = 0; i < 900000; i++) {
            h.add(i);
        }
        Date e = new Date();
        System.out.println("Time taken to add elements from HashSet: " + (e.getTime() - a.getTime()));

        Date s = new Date();
        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        for (int i = 0; i < 900000; i++) {
           l.add(i);
        }
        Date el = new Date();
        System.out.println("Time taken to add elements from Linked HashSet: " +(el.getTime() - s.getTime()));


        Date d = new Date();
        TreeSet t = new TreeSet();
        for (int i = 0; i < 900000; i++) {
            t.add(i);
        }
        Date tl = new Date();
        System.out.println("Time taken to add elements from tree set: " +(tl.getTime() - d.getTime()));

        // Retrieving elements from HashSet and measuring time
        Date Retrieve = new Date();
        Iterator<Integer> hashSetIterator = h.iterator();
        while (hashSetIterator.hasNext()) {
            hashSetIterator.next();
        }
        Date endRetrieve = new Date();
        long hashSetRetrieveTime = endRetrieve.getTime() - Retrieve.getTime();
        System.out.println("Time taken to retrieve elements from HashSet: " + hashSetRetrieveTime );

        // Retrieving elements from LinkedHashSet and measuring time
        Date startLinkedHashSetRetrieve = new Date();
        Iterator<Integer> linkedHashSetIterator = l.iterator();
        while (linkedHashSetIterator.hasNext()) {
            linkedHashSetIterator.next();
        }
        Date endLinkedHashSetRetrieve = new Date();
        long linkedHashSetRetrieveTime = endLinkedHashSetRetrieve.getTime() - startLinkedHashSetRetrieve.getTime();
        System.out.println("Time taken to retrieve elements from LinkedHashSet: " + linkedHashSetRetrieveTime );

        // Retrieving elements from TreeSet and measuring time
        Date startTreeSetRetrieve = new Date();
        Iterator<Integer> treeSetIterator = t.iterator();
        while (treeSetIterator.hasNext()) {
            treeSetIterator.next();
        }
        Date endTreeSetRetrieve = new Date();
        long treeSetRetrieveTime = endTreeSetRetrieve.getTime() - startTreeSetRetrieve.getTime();
        System.out.println("Time taken to retrieve elements from TreeSet: " + treeSetRetrieveTime );
    }
}
