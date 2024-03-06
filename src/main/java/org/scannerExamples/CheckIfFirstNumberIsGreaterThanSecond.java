package org.scannerExamples;

import java.util.Scanner;

public class CheckIfFirstNumberIsGreaterThanSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number :: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number :: ");
        int b = scanner.nextInt();
        boolean isGreater = a > b;
        System.out.println("Is Greater :: " + isGreater);
    }
}
