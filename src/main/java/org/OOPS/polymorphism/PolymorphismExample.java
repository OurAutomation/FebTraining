package org.OOPS.polymorphism;

public class PolymorphismExample {
    // CompileTime Polymorphism -> Static Polymorphism -> Method overloading
    //Run time polymorphism -> Dynamic Polymorphism -> method overriding
    public int add(int a, int b) {//concurrent method or complete method
        return a + b;
    }
//MethodSignature = add2intint

    public void add(int a, String b) {//add2intString

    }

    public int add(int a, int b, int c) {//add3intintint
        return a + b + c;
    }

}
