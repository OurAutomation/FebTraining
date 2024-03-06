package org.lambdaExpressions;

import java.util.Arrays;

public class IterateArrayUsingLambdaExpression {
    static String strArr[] = {"abc", "bca", "dfe"};
    static String[] str2Arr = {"test", "test1", "test2", "test3"};

    static String[][] twoDimArray = {strArr, str2Arr, {"b", "c", "d"}};

    public static void main(String[] args) {
//        Arrays.stream(strArr).forEach(System.out::println);//lambda expressions
        Arrays.stream(twoDimArray).forEach(singleArray -> {
            Arrays.stream(singleArray).forEach(System.out::println);
        });
    }
}
