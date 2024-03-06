package org.accessModifiers2;

import org.accessModifiers.AccessModifiers;

public class Test {
    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();
//        System.out.println(accessModifiers.defaultVariable);//Compilation error default variable
        System.out.println(accessModifiers.publicVariable);
//        System.out.println(accessModifiers.privateVariable);//Compilation error private variable
//        System.out.println(accessModifiers.protectedVariable);//Compilation error protected variable
        accessModifiers.publicMethod();
//        accessModifiers.privateMethod();//Compilation error private method
//        accessModifiers.defaultMethod();//Compilation error default method
//        accessModifiers.protectedMethod();//Compilation error protected method
    }
}
