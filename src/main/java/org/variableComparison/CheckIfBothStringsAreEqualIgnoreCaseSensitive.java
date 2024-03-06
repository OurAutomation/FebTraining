package org.variableComparison;

import java.util.Scanner;

public class CheckIfBothStringsAreEqualIgnoreCaseSensitive {
    public static void main(String[] args) {
        String first,second;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string :: ");
        first = scanner.nextLine();
        first = first.toLowerCase();
        System.out.println("Enter second string :: ");
        second = scanner.nextLine();
        second = second.toLowerCase();
        System.out.println("Are two strings equal :: " + first.equals(second));
    }
}
