package org.ObjectClassExample;

import org.OOPS.inheritance.CalculatorFunctionality;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        Test abcd = new Test();
        Object a = new CalculatorFunctionality();
        Object c = a;
        Object b = new CalculatorFunctionality();
        Object str = "agvcgf";
        Object i = 100;
        System.out.println(a.equals(c));
        System.out.println(a.equals(b));
        System.out.println(test.equals(b));
        System.out.println(test.toString());
        Method[] methods = abcd.getClass().getMethods();
        Arrays.stream(methods).forEach(e-> System.out.println(e.getName()));

        System.out.println();
    }
}
