package org.forLoop;

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        System.out.println("Enter the number :: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double factorial = 1;
        for (int i = a; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("Factorial is  :: " + factorial);
    }
}
