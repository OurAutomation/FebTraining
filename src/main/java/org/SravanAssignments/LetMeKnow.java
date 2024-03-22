package org.SravanAssignments;
import java.util.Date;
import java.util.Scanner;

public class LetMeKnow {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of second to wait :: ");
        int seconds = scanner.nextInt();
        Thread.sleep(seconds * 1000);
        System.out.println("Time is completed");

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of hours to wait: ");
        int hours = scanner.nextInt();
        int seconds = hours * 3600;
        Thread.sleep(seconds * 1000);
        System.out.println("Time is completed");

         */
    }

}
