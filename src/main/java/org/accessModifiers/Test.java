package org.accessModifiers;

public class Test {
    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
        System.out.println(accessModifiers.defaultVariable);
        System.out.println(accessModifiers.publicVariable);
//        System.out.println(accessModifiers.privateVariable); //Compilation error private variable
        System.out.println(accessModifiers.protectedVariable);
        accessModifiers.publicMethod();
//        accessModifiers.privateMethod();//Compilation error private method
        accessModifiers.defaultMethod();
        accessModifiers.protectedMethod();
    }
}
