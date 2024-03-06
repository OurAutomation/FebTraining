package org.methods;

import java.util.Scanner;

//Read my name from console and call printMyNameInUpperCase method from class A
public class PrintMyNameInUpperCase {
    public static void main(String[] args) {
        System.out.println("Enter name :: ");
//      1. Read my name from console
//        => Create a object for scanner class
        Scanner test = new Scanner(System.in);
//        => Call nextLine method to read the value from console. NextLine method will be returning a string. So assign it to a variable
        String str = test.nextLine();
//        2. call printMyNameInUpperCase method from class A
//        => Create a object for class A
        A abc = new A();
//        => call the method
        abc.printMyNameInUpperCase(str);

    }
}
