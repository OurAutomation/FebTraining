package org.IfElseLoop;

import java.util.Scanner;

public class printGreatestNumber {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable :: ");
        a = scanner.nextInt();
        System.out.println("Enter the second variable :: ");
        b = scanner.nextInt();
        boolean aIsGreaterThanB = a > b;
        if(aIsGreaterThanB == true) {
            System.out.println("first number is greater than second number");
        } else if (aIsGreaterThanB == false) {
            System.out.println("second number is greater than first number");
        }

    }
}
