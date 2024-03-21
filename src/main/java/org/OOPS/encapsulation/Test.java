package org.OOPS.encapsulation;

public class Test {
    public static void main(String[] args) {
        EncapsulatedClass encapsulatedClass = new EncapsulatedClass();
        encapsulatedClass.setFirstName("ABC");
        System.out.println(encapsulatedClass.getFirstName());
        encapsulatedClass.setFirstName("test");
        System.out.println(encapsulatedClass.getFirstName());
        encapsulatedClass.setLoginName("Test103");
        boolean userStatus = encapsulatedClass.getUserStatus();
    }
}
