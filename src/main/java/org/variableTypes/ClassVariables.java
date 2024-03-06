package org.variableTypes;

public class ClassVariables {
    static int a = 10; //class variable
    static boolean var = false;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(!var);
    }

    public static void test() {
        System.out.println(a);
    }
}
