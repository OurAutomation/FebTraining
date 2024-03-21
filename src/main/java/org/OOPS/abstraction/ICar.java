package org.OOPS.abstraction;

public interface ICar {
    public void tyre();// abstract methods or not complete methods

    public void engine();

    public void windshield();

    default void screenLock() {
        System.out.println("Automatic lock");
    }
}
