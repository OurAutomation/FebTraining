package org.SravanAssignments;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class FindInterest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Principal Amount : ");
        int p=s.nextInt();
        System.out.println("Enter Time Period in Years : ");
        int t=s.nextInt();
        System.out.println("Enter Rate Of Interest per Annum : ");
        float r=s.nextFloat();
        float total = p*t*r/100;
        System.out.println("Calculated Interest is :" +total);

    }

}
