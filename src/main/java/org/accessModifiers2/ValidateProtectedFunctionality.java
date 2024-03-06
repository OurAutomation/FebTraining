package org.accessModifiers2;


import org.accessModifiers.AccessModifiers;

public class ValidateProtectedFunctionality extends AccessModifiers {
    public static void main(String[] args) {
//        System.out.println(defaultVariable);
        System.out.println(publicVariable);
//        System.out.println(privateVariable);
        System.out.println(protectedVariable);
        publicMethod();
//        privateMethod();
//        defaultMethod();
        protectedMethod();
    }
}
