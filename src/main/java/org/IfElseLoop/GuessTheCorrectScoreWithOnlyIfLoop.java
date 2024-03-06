package org.IfElseLoop;

import java.util.Scanner;
/*
true true == true
true false == false
false true == false
false false = false
 */

public class GuessTheCorrectScoreWithOnlyIfLoop {
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
        if (! (a.equalsIgnoreCase(marriageDate) &&
                b.equalsIgnoreCase(age) &&
                c.equalsIgnoreCase(birthday)) ) {
            System.out.println("Fail");
        }

    }
}
