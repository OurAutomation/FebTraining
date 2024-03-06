package org.methods;

public class RunCalculator {
    int aSquare;

    public static void main(String[] args) {
        // className             variableName             toCreateNewObject ClassName()
        CalculatorFunctionality calculatorFunctionality = new CalculatorFunctionality();
        /* calculatorFunctionality.add(1, 2);
        calculatorFunctionality.add(2, 3);
        calculatorFunctionality.subtraction(1, 2); */
        int aSquare = calculatorFunctionality.square(10);
        int bSquare = calculatorFunctionality.square(11);
        int totalValue = aSquare + bSquare + 2 * 10 * 11;
        System.out.println(totalValue);
    }
}
