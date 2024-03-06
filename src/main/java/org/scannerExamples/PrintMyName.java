package org.scannerExamples;

import java.util.Scanner;

public class PrintMyName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name :: ");
        String a  = scanner.nextLine();
        System.out.println("Name is :: " + a);
    }
}
