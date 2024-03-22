package org.SravanAssignments;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args){
        Integer[] a={1,0,4,0,5,0,3,2};
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
}

// 3 buckets - 3,5,7 - 10 litres- 15 litres
// 3+5+7=15
//15/3 = 5 // 3
//15/5 = 3  // 5
//15/7 = 2.14  // 7

//10
// 3 = 2 -
// 5 = 3.333
// 7 = 4.6728;

//30/5 = 6 - 3 years
// 30/3= 10 - 5 years
// 30/2 = 14 - 7 years