package org.SravanAssignments;

public class HighestLength {
    public static void main(String[] args) {
        String s = "my name is rohitha";
        String[] array = s.split(" ");
        int min = 0;
        String word = "";
        for(int i = 0; i < array.length; i++) {
            if (array[i].length()>min) {
                min = array[i].length();
                word = array[i];
            }
        }
        System.out.println("Highest Length Word is :" + word);
    }
}
