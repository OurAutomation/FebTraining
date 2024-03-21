package org.constructors;

public class Test {
    public static void main(String[] args) {
        PrintMyDetails printMyDetails = new PrintMyDetails();
        PrintMyDetails printMyDetails1 = new PrintMyDetails("bvdhbdfhb");
        PrintMyDetails printMyDetails21 = new PrintMyDetails("bvdhbdfxvfdbhb");
        PrintMyDetails printMyDetai = new PrintMyDetails("sdv","avds","vsdfv");
        PrintMyDetails printMy = new PrintMyDetails("dfdfb","gnf","fng");
        System.out.println(printMyDetai.getFirstName());
        System.out.println(printMy.getFirstName());
        System.out.println(printMyDetai.getLocationName());
        System.out.println(printMy.getLocationName());


    }
}
