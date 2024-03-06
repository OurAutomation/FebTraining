package org.integerPrograms;

public class PrimeNumber {
    /*
    number/1==0; number/number=0.
     */
    public static void main(String[] args) {
        //1,2,3,5,7,11,13,17,19
        int maxPrimeNumbers = 100;
        System.out.print(1 + ",");
        A:
        for (int i = 2; i <= maxPrimeNumbers; i++) {
            int numberOfRemainderAsZero = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    numberOfRemainderAsZero++;
                    if (numberOfRemainderAsZero == 1) {
                        continue A;
                    }
                }
            }
            System.out.print(i + ",");
        }
    }
}
