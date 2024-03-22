package org.SravanAssignments;

public class lowestLength {
    public static void main(String[] args) {
        String str= "i want peace";
        String[] s=str.split(" ");
        int max=5;
        String w="";
        for(int i=0;i<s.length;i++) {
            if ((s[i].length() < max)) {
                max = s[i].length();
                w = s[i];
            }
        }
            System.out.println(w);
    }
}
