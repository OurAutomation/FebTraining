package org.SravanAssignments;
import java.util.ArrayList;
import java.util.List;
public class ArrayListAssignmentSolution {
    public static void main(String[] args) {
       ArraylistforAssignments v=new ArraylistforAssignments();
 //1. create an arraylist for string, long and double, Add some values and print them
        System.out.println(v.ListOfStrings());
        System.out.println(v.ListOfLongs());
        System.out.println(v.ListOfDoubles());
//2. Search for given number in arraylist and print true or false
        String b= "Sudha";
        Long a= 123L;
        System.out.println(v.ListOfStrings().contains(b));
        System.out.println(v.ListOfStrings().contains(a));
//3. Search for given number in arraylist and print true or false without using contains method
        int index = v.ListOfStrings().indexOf(b);
        boolean p = index != -1;
        /*boolean p=false;*/
        /*for(String m:v.ListOfStrings()){
            if (b.equalsIgnoreCase(m)) {
                p = true;
                break;}}*/
        System.out.println(p);
//4. Write a program for containsAll
        List<String> f = new ArrayList<>();
        f.add("Rohi");
        f.add("Thanu");
        System.out.println(v.ListOfStrings().containsAll(f));
// 5. Create an arraylist and one number. Now add 10th number directly(list.add(10,123667);. Now tell me what will be printed if i call list.get(3)?
        /*List<Integer> m= new ArrayList<>();
        m.add(23);
        m.add(10,24);
        System.out.println(m.get(2));*/

    }}

