package org.IfElseLoop;

import java.util.Scanner;

public class SimplifiedPrintGreatestNumberOrEquals {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable :: ");
        a = scanner.nextInt();
        System.out.println("Enter the second variable :: ");
        b = scanner.nextInt();
        if (a > b) {
            System.out.println("first number is greater than second number");
        } else if (b > a) {
            System.out.println("second number is greater than first number");
        } else if (a == b) {
            System.out.println("Both numbers are equal");
        } else {
            System.out.println("None of the above conditions match");
        }

    }
}
