package org.errors;

public class StackOverFlowError {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("Working");
        test();
    }
}
