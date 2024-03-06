package org.variableComparison;

import java.util.Scanner;

public class CheckIfBothStringsAreEqualIgnoreCaseSensitiveUsingEqualsIgnoreCaseMethod {
    public static void main(String[] args) {
        String first, second;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string :: ");
        first = scanner.nextLine();
        System.out.println("Enter second string :: ");
        second = scanner.nextLine();
        System.out.println("Are two strings equal :: " + first.equalsIgnoreCase(second));
        //contains and ignore case sensitive
    }
}
