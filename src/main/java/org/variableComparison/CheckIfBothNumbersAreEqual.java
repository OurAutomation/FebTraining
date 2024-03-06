package org.variableComparison;

import java.util.Scanner;

public class CheckIfBothNumbersAreEqual {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable :: ");
        a = scanner.nextInt();
        System.out.println("Enter the second variable :: ");
        b = scanner.nextInt();
        boolean areEqual = a == b;
        System.out.println("Numbers are equal :: " + areEqual);
        //a=b true
        //int,short,byte,double,long and float. boolean
        //String
    }
}
