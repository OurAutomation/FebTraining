package org.SravanAssignments;

public class ArmstrongNum {
    public static void main(String[] args) {
        int i = 153;
        int tempi = i;
        int total = 0;
        while (tempi > 0) {
            int remainder = tempi % 10;
            total +=Math.pow(remainder,3);
            tempi = tempi / 10;
        }
        if (total == i) {
            System.out.println("It is an armstrong number");
        } else {
            System.out.println("It is not an armstrong number");
        }
    }
}
