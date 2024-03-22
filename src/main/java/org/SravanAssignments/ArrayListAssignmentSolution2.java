package org.SravanAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignmentSolution2 {
        public static void main(String[] args) {
            ArraylistforAssignments v=new ArraylistforAssignments();
  //6. In a string list print the length first element
            List<String> list = new ArrayList<>();
            list = v.ListOfStrings();
            System.out.println(v.ListOfStrings());
            System.out.println(list.get(0).length());
 //7. Print the repetitions of the numbers in the list
            List<String> strList= v.ListOfStrings();
            while(!strList.isEmpty()) {
                String firstElement = strList.get(0);
                int initialSize = strList.size();
                strList.remove(strList.get(0));
                int finalSize = strList.size();
                System.out.println(firstElement + "::" +(initialSize-finalSize));
            }

//8. Check if the given number is duplicated in the list
            int number = 2;
            List<Integer> intList = v.ListOfIntegers();
            boolean isDuplicated = intList.indexOf(number) != intList.lastIndexOf(number);
                    /*false;
            int count=0;
            for (int h : v.ListOfIntegers()){
                    if(h== Number ){
                       count++;
                    }
                }if (count > 1) {
                    isDuplicated = true;
                    break;
                }*/
                System.out.println(isDuplicated);
//9. Print a integer list in descending order
            intList = v.ListOfIntegers();

            System.out.println(intList);
            Collections.sort(intList);
            Collections.reverse(intList);
            System.out.println(intList);

}}
