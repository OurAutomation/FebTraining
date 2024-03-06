package org.scannerExamples;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first variable :: ");
        int a  = scanner.nextInt();
        System.out.println("Enter second variable :: ");
        int b = scanner.nextInt();
        System.out.println("total is :: " + (a-b));
    }
}
