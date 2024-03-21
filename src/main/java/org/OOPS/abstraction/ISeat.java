package org.OOPS.abstraction;

public interface ISeat {
    public void seats();

    default void screenLock() {
        System.out.println("Manual lock");
    }
}
