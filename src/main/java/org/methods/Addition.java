package org.methods;

public class Addition {
    static int a = 10, b = 2, c = 10, d = 1, e = 13;//numeric

    public static void main(String[] args) {
        allArithmeticOperations(a, b);
        allArithmeticOperations(c, d);
        allArithmeticOperations(b, d, e);
        allArithmeticOperations(101, 10, 4);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void allArithmeticOperations(int a, int b) {
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
    }

    public static void allArithmeticOperations(int a, int b, int c) {
        System.out.println(a + b + c);
        System.out.println(a * b * c);
        System.out.println(a - b - c);
        System.out.println(a / b / c);
        System.out.println(a % b % c);
    }
}
