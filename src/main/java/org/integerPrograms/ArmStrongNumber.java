package org.integerPrograms;

public class ArmStrongNumber {
    //153 = 1^3+5^3+3^3
    //1+125+27=153
    //125 =1^3+2^3+5^3
    //1+8+125=134
    public static void main(String[] args) {
        int i = 153;
        int tempi = i;
        int total = 0;
        while (tempi > 0) {
            int remainder = tempi % 10;
            total += remainder * remainder * remainder;
            tempi = tempi / 10;
        }
        if (total == i) {
            System.out.println("It is an armstrong number");
        } else {
            System.out.println("It is not an armstrong number");
        }
    }
}
