package org.OOPS.polymorphism;

public class CarVersion2 extends CarVersion1 {
    //Method overriding
    public void engine() {//method signature
        System.out.println("2 litre engine");
    }

    public void engine(String abc) {

    }

    public void screen() {
        System.out.println("android screen");
    }
}
