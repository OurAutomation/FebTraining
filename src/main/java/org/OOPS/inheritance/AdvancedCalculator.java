package org.OOPS.inheritance;

public class AdvancedCalculator extends CalculatorFunctionality {

    public double getThePowerValue(double number, double power) {
        return Math.pow(number, power);
    }

    public double returnSquareValue(double number) {
        return Math.pow(number, 2);
    }

    public double returnSquareRootValue(double number) {
        return Math.sqrt(number);
    }

}
