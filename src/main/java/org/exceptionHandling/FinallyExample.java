package org.exceptionHandling;

public class FinallyExample {
    public static void main(String[] args) {
        /*try {
            System.out.println(1 / 0);
            System.out.println("Hello");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Hello this is finally block");
        }*/
        try {
            System.out.println(1 / 0);
            System.out.println("Hello");
        } finally {
            System.out.println("Hello this is finally block 2");
        }
        System.out.println("Program completed");
    }

}
