package org.staticMethods;

public class StaticMethods {
    public static void main(String[] args) {
        DifferentTypesOfMethods differentTypesOfMethods = new DifferentTypesOfMethods();
        differentTypesOfMethods.print();
//        differentTypesOfMethods.printLn();
        System.out.println(differentTypesOfMethods.name);
        DifferentTypesOfMethods.printLn();
        System.out.println(DifferentTypesOfMethods.email);
    }
}
