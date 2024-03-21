package org.OOPS.abstraction;

public class BenzCarVersion1 extends AbstractClassExample {
    @Override
    public void tyre() {
        System.out.println("CEAT tyres");
    }

    @Override
    public void engine() {
        System.out.println("1.5 ltr engine");
    }

    @Override
    public void windshield() {
        System.out.println("2 mm windshield");
    }
}
