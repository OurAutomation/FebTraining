package org.integerPrograms;

import java.util.Arrays;

public class FindTheMaximumNumberInTheGivenArray {
    static int[] iArr = {1, 2, 53, 34, 23, 4, 12, 33, 39, 132, 28, 3};

    public static void main(String[] args) {
        /*int max = iArr[0];
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] > max)
                max = iArr[i];
        }
        System.out.println("Maximum number is :: " + max);*/
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        System.out.println("Maximum number is :: " + iArr[iArr.length - 1]);
        System.out.println("Minimum number is :: " + iArr[0]);
    }
}
