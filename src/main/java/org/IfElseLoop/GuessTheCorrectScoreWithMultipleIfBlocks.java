package org.IfElseLoop;

import java.util.Scanner;
/*
true true == true
true false == false
false true == false
false false = false
 */

public class GuessTheCorrectScoreWithMultipleIfBlocks {
    public static void main(String[] args) {
        String marriageDate = "01/01/2024";
        String age = "10";
        String birthday = "01/02/2024";
        String a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marriage date :: ");
        a = scanner.nextLine();
        System.out.println("Enter the age :: ");
        b = scanner.nextLine();
        System.out.println("Enter the birthday :: ");
        c = scanner.nextLine();
        if (a.equalsIgnoreCase(marriageDate)) {
            System.out.println("Marriage date is correct");
        } else {
            System.out.println("marriage date is incorrect");
        }

        if (b.equalsIgnoreCase(age)) {
            System.out.println("Age is correct");
        } else {
            System.out.println("Age is incorrect");
        }

        if (c.equalsIgnoreCase(birthday)) {
            System.out.println("Birthday is correct");
        } else {
            System.out.println("Birthday is incorrect");
        }

    }
}
