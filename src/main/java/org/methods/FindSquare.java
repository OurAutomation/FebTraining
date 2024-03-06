package org.methods;

public class FindSquare {
    static int aSquareValue, bSquareValue;

    public static void main(String[] args) {
        //(a+b)^2= a^2+b^2+2ab
        int a = 1222222, b = 11222222;
        int i = 2 * a * b;
//        getASquareValue(a);
//        getBSquareValue(b);
        aSquareValue = square(a);
        bSquareValue = square(b);
        int totalValue = aSquareValue + bSquareValue + i;
        System.out.println(totalValue);
    }

    public static int square(int a) {
        int squareValue = a*a;
        return squareValue;
    }
   /* public static void getASquareValue(int a) {
        aSquareValue = a * a;
    }

    public static void getBSquareValue(int b) {
        bSquareValue = b * b;
    }*/
}
