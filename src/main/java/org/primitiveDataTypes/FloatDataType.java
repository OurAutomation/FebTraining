package org.primitiveDataTypes;

public class FloatDataType {
    public static void main(String[] args) {
//        int a = 0.001;//Compilation Error
        float firstVariable = 111122.001f;
        float secondVariable = 0.041f;
        System.out.println(firstVariable + secondVariable); // 3
        System.out.println(firstVariable - secondVariable);// -1
        System.out.println(firstVariable * secondVariable);// 4
        System.out.println(firstVariable / secondVariable);// 2
        System.out.println(firstVariable % secondVariable);// 1
    }
}
