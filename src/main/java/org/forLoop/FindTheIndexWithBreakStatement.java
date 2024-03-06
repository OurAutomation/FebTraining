package org.forLoop;

import java.util.Scanner;

public class FindTheIndexWithBreakStatement {
    public static void main(String[] args) {
        System.out.println("Pass the names comma separated :: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Enter The Name to find index :: ");
        String findStr = scanner.nextLine();
        String[] split = str.split(",");// my name is a
        for (int i = 0; i < split.length; i++) {
            if (split[i].trim().equalsIgnoreCase(findStr.trim())) {
                System.out.println("Index of the given string is :: " + i);
                break;
            }
        }
    }
}
