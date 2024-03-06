package org.whileLoop;

public class SampleWhileLoopForIteratingFromArrays {
    public static void main(String[] args) {
        String strArr[] = {"abc", "bca", "dfe", "sdvs"};
        int[] intArr = {2, 3, 4, 5, 6, 7};
        int i = 0;
        while (i < intArr.length) {
            System.out.println(intArr[i]);
            i++;
        }
        boolean isCorrect = true;
        /*while (isCorrect) {
         *//*
            isCorrect = false;
            *//*

        }*/

        int j = 0;
        while (j > 0) { //0 times executed
            System.out.println(j);
        }
    }
}
