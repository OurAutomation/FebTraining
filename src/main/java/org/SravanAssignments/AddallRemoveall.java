package org.SravanAssignments;

import java.util.HashSet;
import java.util.Set;


public class AddallRemoveall {
    public static void main(String[] args) {
        Set<Integer> r= new HashSet<>();
        r.add(123);
        r.add(234);
        r.add(456);
        r.add(123);
        Set<Integer> s= new HashSet<>();
        s.add(379);
        s.add(479);
        s.addAll(r);
        System.out.println(s);
        s.removeAll(r);
        System.out.println(s);


    }
}
