package org.reassigningVariable;

public class FinalVariable {
    static final int a = 10;

    public static void main(String[] args) {
//        a = 11; value cannot be reassigned because while declaring variable is defined as final
        final int b = 20;
        System.out.println(a);
//        b = 30;
    }
}
