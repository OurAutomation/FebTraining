package org.OOPS.abstraction;

public class Test {
    public static void main(String[] args) {
        ICar car;
        car = new Version1();
        car.tyre();
        car.engine();
        car.windshield();
        car.screenLock();
        car = new Version2();
        car.tyre();
        car.engine();
        car.windshield();
        AbstractClassExample abstractClassExample;
        abstractClassExample = new BenzCarVersion1();
        abstractClassExample.tyre();
        abstractClassExample.engine();
    }
}
