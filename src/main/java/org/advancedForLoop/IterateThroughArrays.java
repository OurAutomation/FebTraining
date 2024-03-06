package org.advancedForLoop;

public class IterateThroughArrays {
    static String strArr[] = {"abc", "bca", "dfe", "sdvs"};
    static int[] intArr = {2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        /*for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            System.out.println(str);
        }*/
// Advanced for loop or for each loop
        for (String str : strArr) {
            System.out.println(str);
        }
        for (int var : intArr) {
            System.out.println(var);
        }
        for (; ; ) {
//infinite for loop until break statement is called
        }

    }
}