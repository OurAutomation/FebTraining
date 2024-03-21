package org.OOPS.abstraction;

public class Version2 implements ICar {
    @Override
    public void tyre() {
        System.out.println("MRF tyres");
    }

    @Override
    public void engine() {
        System.out.println("2.5 ltr engine");
    }

    @Override
    public void windshield() {
        System.out.println("3 mm windshield");
    }
}
