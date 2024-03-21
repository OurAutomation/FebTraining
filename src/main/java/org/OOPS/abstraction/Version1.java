package org.OOPS.abstraction;

public class Version1 implements ICar, ISeat {
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

    @Override
    public void screenLock() {
       ISeat.super.screenLock();
    }

    @Override
    public void seats() {
        System.out.println("Leather seats");
    }
}
