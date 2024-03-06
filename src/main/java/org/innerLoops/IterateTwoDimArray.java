package org.innerLoops;

public class IterateTwoDimArray {
    static String strArr[] = {"abc", "bca", "dfe"};
    static String[] str2Arr = {"test", "test1", "test2", "test3"};

    static String[][] twoDimArray = {strArr, str2Arr, {"b", "c", "d"}};

    public static void main(String[] args) {
        parentLoop:
        for (String[] strAr : twoDimArray) {
            /*if (strAr[0].equalsIgnoreCase("test")) {
                continue parentLoop;
            }*/
            childLoop:
            for (String str : strAr) {
                System.out.println(str);
                if (str.equalsIgnoreCase("test1"))
                    continue parentLoop;
            }
        }
    }
}
