package org.integerPrograms;

public class SwapTwoNumbersWithoutTempVariable {
    public static void main(String[] args) {
        int a = 10, b = 15;
        a = a + b;//25
        b = a - b;//10
        a = a - b;//15
        System.out.println("a :: " + a);
        System.out.println("b :: " + b);
    }
}
