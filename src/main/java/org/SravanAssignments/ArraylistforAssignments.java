package org.SravanAssignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//1. create an arraylist for string, long and double, Add some values and print them
public class ArraylistforAssignments {
    public List<String> ListOfStrings() {
        List<String> r = new ArrayList<>();
        r.add("Rohi");
        r.add("Sudha");
        r.add("Thanu");
        return r;
    }
    public List<Integer> ListOfIntegers(){
        List<Integer> i=new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(4);
        i.add(1);
        return i;
    }
        public List<Long> ListOfLongs() {
            List<Long> s = new ArrayList<>();
            s.add(19031982L);
            s.add(21122000L);
            s.add(13081989L);
            return s;
    }
    public List<Double> ListOfDoubles() {
        List<Double> t = new ArrayList<>();
        t.add(19031982.78);
        t.add(21122000.89);
        t.add(13081989.00);
        return t;
    }
}
