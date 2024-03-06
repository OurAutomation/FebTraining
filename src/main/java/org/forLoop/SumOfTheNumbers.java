package org.forLoop;

import java.util.Scanner;

public class SumOfTheNumbers {
    public static void main(String[] args) {
        System.out.println("enter the number :: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= a; i++) {
            total += i;
        }
        System.out.println(total);
        //n(n+1)/2
    }
}
