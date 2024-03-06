package org.IfElseLoop;

import java.util.Scanner;

public class PrintGreatestNumberOrEquals {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable :: ");
        a = scanner.nextInt();
        System.out.println("Enter the second variable :: ");
        b = scanner.nextInt();
        if (a > b == true) {
            System.out.println("first number is greater than second number");
        } else if (b > a == true) {
            System.out.println("second number is greater than first number");
        } else if ((a == b) == true) {
            System.out.println("Both numbers are equal");
        } else {
            System.out.println("None of the above conditions match");
        }

    }
}
