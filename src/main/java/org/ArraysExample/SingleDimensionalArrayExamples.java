package org.ArraysExample;

public class SingleDimensionalArrayExamples {
    static String str = "abc";
    // str = "abc", "bca", "dfe";
    //Arrays
//                               0     1       2
//    static String[] strArr = {"abc", "bca", "dfe"};
    static String strArr[] = {"abc", "bca", "dfe"};
    static String[] str2Arr = new String[5];
    static int[] intArr = new int[5];

    public static void main(String[] args) {
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
//        System.out.println(strArr[3]);
        System.out.println(strArr.length);
        System.out.println(str2Arr.length);
        System.out.println(str2Arr[1]);
        System.out.println(intArr[1]);
        str2Arr[0] = "test";
//        str2Arr[0] = 1; Will throw compilation error
        str2Arr[1] = "test1";
        str2Arr[0] = "0000";
//        str2Arr[5] = "abcd";
        System.out.println(str2Arr[1]);//test1
        System.out.println(str2Arr[0]);//0000
        System.out.println(str2Arr[2]);//null
    }
}
