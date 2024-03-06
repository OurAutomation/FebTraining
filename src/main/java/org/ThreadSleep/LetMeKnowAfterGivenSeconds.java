package org.ThreadSleep;

import java.util.Date;
import java.util.Scanner;

//Let me know after 10 seconds
//Let me know after given hour
public class LetMeKnowAfterGivenSeconds {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of second to wait :: ");
        int seconds = scanner.nextInt();
        Date date = new Date();
        System.out.println("Before Date " + date);
        //Milliseconds = seconds * 1000;
        //1000 ms = 1 second
        Thread.sleep(seconds * 1000);
        date = new Date();
        System.out.println("After date " + date);
        System.out.println("Time is completed");
    }
}
