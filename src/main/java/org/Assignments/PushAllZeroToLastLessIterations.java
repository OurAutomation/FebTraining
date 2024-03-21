package org.Assignments;

import java.util.Arrays;

public class PushAllZeroToLastLessIterations {
    static int[] iArr = {1, 0, 0, 2, 0, 0, 3, 0, 4, 0, 6, 0};
    public static void main(String[] args) {
        for (int i = 0; i < iArr.length; i++) {
            System.out.println("Before Iteration " + (i+1) + " " + Arrays.toString(iArr));
            if (iArr[i] == 0) {
                boolean areAllZeros = true;
                boolean isSwapped = false;
                for (int j = i + 1; j < iArr.length; j++) {
                    if (iArr[j] != 0 && !isSwapped) {
                        iArr[i] = iArr[j];
                        iArr[j] = 0;
                        isSwapped = true;
                    } else if (iArr[j] != 0 && isSwapped) {
                        areAllZeros = false;
                        break;
                    }
                }
                if (areAllZeros) {
                    System.out.println("After Iteration  " + (i+1) + " " + Arrays.toString(iArr));
                    break;
                }
            }
            System.out.println("After Iteration  " + (i+1) + " " + Arrays.toString(iArr));
        }
        System.out.println(Arrays.toString(iArr));
    }
}
