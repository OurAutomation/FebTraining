package org.IfElseLoop;

import java.util.Scanner;

public class CheckIfBothNumbersAreEqual {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable :: ");
        a = scanner.nextInt();
        System.out.println("Enter the second variable :: ");
        b = scanner.nextInt();
        if (a == b) {
            System.out.println("Both numbers are equal");
        } else {
            System.out.println("Both are not equal");
        }
    }
}
