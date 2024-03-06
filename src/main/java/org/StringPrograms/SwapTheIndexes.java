package org.StringPrograms;

public class SwapTheIndexes {
    public static void main(String[] args) {
        String str = "This is";
        //0,1
        //htis is
        //4,6
        //thissi
        int firstIndex = 1,secondIndex=2;
        char[] carr = str.toCharArray();
        char temp;
        temp = carr[firstIndex];
        carr[firstIndex] = carr[secondIndex];
        carr[secondIndex] = temp;
        System.out.println(new String(carr));

    }
}
