package org.methods;

public class AdvancedCalculator extends CalculatorFunctionality {
    //inheritance
    public void test() {
        add(1, 2);
        subtraction(2, 3);
        multiply(3, 4);
    }

    public static void main(String[] args) {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        System.out.println(advancedCalculator.add(1, 2));
    }
}
