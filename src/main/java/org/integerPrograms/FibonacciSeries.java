package org.integerPrograms;

public class FibonacciSeries {
    //0,1,1,2,3,5,8,13
    //50
    public static void main(String[] args) {
        int firstVariable = 0;
        int secondVariable = 1;
        System.out.print(firstVariable + ",");
        System.out.print(secondVariable + ",");
        int thirdVariable = firstVariable + secondVariable;
        while ((thirdVariable + secondVariable) <= 50) {
            thirdVariable = firstVariable + secondVariable;
            System.out.print(thirdVariable + ",");
            firstVariable = secondVariable;
            secondVariable = thirdVariable;
        }
    }
}
