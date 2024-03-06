package org.ArraysExample;

public class TwoDimensionalArrayExamples {
    static String str = "abc";

    static String strArr[] = {"abc", "bca", "dfe"};
    static String[] str2Arr = {"test", "test1", "test2", "test3"};

    static String[][] twoDimArray = {strArr, str2Arr, {"b", "c", "d"}};
    static String[][] twoDimArray1 = new String[2][4];
    static String[][][] threeDimArray1 = {twoDimArray, twoDimArray1};
    //s="str"
    //s[1]

    public static void main(String[] args) {
        System.out.println(twoDimArray[0][0]);
        System.out.println(twoDimArray[1][3]);
        System.out.println(twoDimArray[2][1]);//c
//        System.out.println(twoDimArray[2][3]);//c
        System.out.println(twoDimArray.length);//3
        System.out.println(twoDimArray[2].length);//3
        twoDimArray[1] = new String[]{"123"};
        System.out.println(twoDimArray[1].length);//1
        System.out.println(twoDimArray[1][1]);


    }
}
