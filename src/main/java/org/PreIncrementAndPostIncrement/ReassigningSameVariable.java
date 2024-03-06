package org.PreIncrementAndPostIncrement;

public class ReassigningSameVariable {
    public static void main(String[] args) {
        int i = 10;
        i += 10;
        //        i = i+10;
        i *= 2;
        //        i = i*2;
        i /= 2;
        //        i = i/2;

        System.out.println(i);
    }
}
