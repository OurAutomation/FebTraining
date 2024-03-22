package org.SravanAssignments;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name");
        String a=s.nextLine();
        System.out.println("Enter Your Address");
        String address= s.nextLine();
        System.out.println("Enter age");
        int age=s.nextInt();
        Assignment1Call Cat=new Assignment1Call();
        Cat.C(a,age,address);
        // Access the Method using the Object Reference:Once you have an instance of the other class, you can use the object reference followed by a dot (.) to access the method you want to call.//


    }
}
