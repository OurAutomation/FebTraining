package org.integerPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SplitWiseProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the amount and names :: ");
        String namesAndAmounts = scanner.nextLine();
        String[] split = namesAndAmounts.split("\\s+");
        String[] names = new String[split.length];
        int[] amounts = new int[split.length];
        for(int i=0;i< split.length;i++) {
            names[i]=split[i].replaceAll("[0-9]","");
            amounts[i]= Integer.parseInt(split[i].replaceAll("[^0-9]",""));
        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(amounts));
        int totalAmount =0;
        for(int amount:amounts) {
            totalAmount+=amount;
        }
        int avg = totalAmount/amounts.length;
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " :: " + (avg-amounts[i]));
        }
    }
}
