package org.staticMethods;

public class DifferentTypesOfMethods {
    String name = "abc";
    static String email = "Test@gmail.com";

    //Non static Method
    public void print() {
        name = "";
        email = "";
        System.out.println("ABC");
    }

    //static method
    public static void printLn() {
//        name="test"; // error will be thrown because name is a non static variable
        email = "Test1@gmail.com";
        System.out.println("Next Line");
    }
}
