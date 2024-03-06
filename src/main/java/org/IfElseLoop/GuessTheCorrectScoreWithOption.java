package org.IfElseLoop;

import java.util.Scanner;


public class GuessTheCorrectScoreWithOption {
    public static void main(String[] args) {
        String marriageDate = "2024";
        String age = "10";
        String birthday = "2024";
        String a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marriage date :: ");
        a = scanner.nextLine();
        System.out.println("Enter the age :: ");
        b = scanner.nextLine();
        System.out.println("Enter the birthday :: ");
        c = scanner.nextLine();
        if ((a.equalsIgnoreCase(marriageDate) || b.equalsIgnoreCase(age)) && c.equalsIgnoreCase(birthday)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}
