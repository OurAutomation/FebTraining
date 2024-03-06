package org.scannerExamples;

import java.util.Scanner;

public class CreateABio {
    // Hi, My name is {name}, I am {old} years old, My email is {email}, my address is {address}, i have job {jobStatus} and my percentage is {percentage}
    public static void main(String[] args) {
        String name, email, address;
        int age;
//        String email;
//        String address;
        boolean jobStatus;
        float percentage;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name :: ");
        name = scanner.nextLine();
        System.out.println("Enter your email :: ");
        email = scanner.nextLine();
        System.out.println("Enter your age :: ");
        age = scanner.nextInt();
        System.out.println("Enter your address :: ");
        address = scanner.nextLine();
        System.out.println("Do you have a job :: ");
        jobStatus = scanner.nextBoolean();
        System.out.println("Enter your percentage :: ");
        percentage = scanner.nextFloat();
        System.out.println("Hi, My name is " + name + ", I am " + age + " years old, My email is " + email + ", " +
                "my address is " + address + ", i have job " + jobStatus + " and my percentage is " + percentage);
    }
}
