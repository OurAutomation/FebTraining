package org.accessModifiers;

public class AccessModifiers {
    //Public -- Class or method can be accessible across the project
    //Private -- Class or method can be accessible only in that class
    //Default -- Classes or method can only be accessed in the same package
    //Protected -- Classes or method can only be accessed in the same package and the child class
    public static String publicVariable = "This is public variable";
    private static String privateVariable = "This is private variable";
    static String defaultVariable = "This is default variable";
    protected static String protectedVariable = "This is protected variable";

    //This method can be accessed anywhere in the project
    public static void publicMethod() {
        System.out.println("This is public method");
    }

    //This method can only be accessed in the same class
    private static void privateMethod() {
        System.out.println("This is private method");
    }

    protected static void protectedMethod() {
        System.out.println("This is protected method");
    }

    static void defaultMethod() {
        System.out.println("This is default method");
    }

    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
        System.out.println(accessModifiers.defaultVariable);
        System.out.println(accessModifiers.publicVariable);
        System.out.println(accessModifiers.privateVariable);
        System.out.println(accessModifiers.protectedVariable);
        accessModifiers.publicMethod();
        accessModifiers.privateMethod();
        accessModifiers.defaultMethod();
        accessModifiers.protectedMethod();
    }


}
