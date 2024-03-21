package org.casting;

import org.OOPS.inheritance.AdvancedCalculator;
import org.OOPS.inheritance.CalculatorFunctionality;

public class UpCastingAndDownCasting {
    public static void main(String[] args) {
        CalculatorFunctionality parentClass = new AdvancedCalculator();
//        CalculatorFunctionality parentClass = new CalculatorFunctionality();
        //up casting
        CalculatorFunctionality calculatorFunctionality = (CalculatorFunctionality) parentClass;
        //down casting
        AdvancedCalculator advancedCalculator = (AdvancedCalculator) calculatorFunctionality;

    }
}
