package org.methods;

public class MultipleValues {
    public static void main(String[] args) {
        int q = 10, y = 12;
        CalculatorFunctionality calculatorFunctionality = new CalculatorFunctionality();
        int multiply = calculatorFunctionality.multiply(q, y);
        System.out.println(multiply);
    }
}
