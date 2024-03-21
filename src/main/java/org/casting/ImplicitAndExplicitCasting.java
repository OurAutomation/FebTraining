package org.casting;

public class ImplicitAndExplicitCasting {
    public static void main(String[] args) {
        //byte > short > integer > long > double
        byte b = 8;
        short c = 110;
        int i = 1999;
        long l = 196;
        double d = 12222222.54;
        // implicit casting ->  mapping data types to higher data types
        short s = b;
        int j = s;
        long k = j;
        //explicit casting -> converting higher data types to lower data types
        byte a = (byte) d;
        byte r = (byte) l;
        float f = (float) d;
        int h = (int) l;
        System.out.println(r);

    }
}
