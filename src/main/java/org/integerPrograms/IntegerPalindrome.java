package org.integerPrograms;

public class IntegerPalindrome {
    static int i = 11011;
    static int j = 10111;

    //    String str = Integer.toString(i);
    /*
    i=11011;
    reversei=0;
    remainder=i%10=1
    i=i/10=1101
    reversei=remainder

    remainder=i%10=1
    i=i/10=110
    reversei=reversei+remainder=11

   remainder=i%10=0
    i=i/10=11
    reversei=reversei+remainder=11011

    */
    public static void main(String[] args) {
        int reversei = 0;
        int tempI=i;
        while (tempI > 0) {
            int remainder = tempI % 10;
            tempI = tempI / 10;
            reversei = reversei * 10 + remainder;
        }
        System.out.println(reversei);
        if (reversei == i) {
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Given number is not palindrome");
        }
    }
//11

}
