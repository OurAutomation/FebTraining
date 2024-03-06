package org.scannerExamples;

import java.util.Scanner;

public class Addition {
    int a = 10;
    static int b; //variable declaration

    public static void main(String[] args) {
        b = 10; // variable assignment
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first variable :: ");
        int a = scanner.nextInt();
        System.out.println("Enter second variable :: ");
        int b = scanner.nextInt();
        System.out.println("total is :: " + (a + b));
    }
}
