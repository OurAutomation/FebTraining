package org.OOPS.polymorphism;

public class Test {
    public static void main(String[] args) {
        PolymorphismExample polymorphismExample = new PolymorphismExample();
        polymorphismExample.add(1, 2);
        polymorphismExample.add(1, 3, 5);

        //method overriding ->  Runtime polymorphism -> dynamic polymorphism
        CarVersion1 carVersion1 = new CarVersion2();
        carVersion1.screen();
        carVersion1.engine();
        carVersion1 = new CarVersion1();
        carVersion1.screen();
        carVersion1.engine();
    }
}
