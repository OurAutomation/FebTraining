package org.SravanAssignments;

import java.util.Scanner;

public class ShareEqually {
    public static void main(String[] args) {
       /* String[] name={"R","S","T"};
        Integer[] Ex={3,5,7};
        int TotalTC=10;
        int TotalEX=15;
        for (int i=0;i<Ex.length;i++) {
            int p1 = TotalEX / Ex[i];
            float p2 = TotalTC/p1;
            System.out.println(name[i]+":"+Math.round(p2)+"TestCases");
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int numberOfPeople = scanner.nextInt();
        System.out.println("Enter total number of Testcases");
        int total= scanner.nextInt();
        scanner.nextLine();
        int  totalExperience=0;
        String[] names = new String[numberOfPeople];
        Integer[] ex = new Integer[numberOfPeople];
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Enter name for person " + (i+1) + ": ");
            names[i] = scanner.nextLine();
            System.out.println("Enter Total Experience for each person " + (i+1) + ": ");
            ex[i] = scanner.nextInt();
            scanner.nextLine();
            totalExperience += ex[i];
        }
        System.out.println("Total Experience :"+ totalExperience);
        for (int i = 0; i < ex.length; i++) {
            int p1 =  totalExperience/ ex[i];
            float p2 = total/ p1;
            System.out.println(names[i] + ": "+names[i]+" can write "+ Math.round(p2) + " TestCases");
        }


    }
}
        //I Have 10 TC
        // share then
        // equally to 3 people
        //R has 3 Ex = 5 Tc
        //S has 5 Ex = 3 TC
        //T has 7 Ex = 2.14 TC
        //Total 15 EX
        //10/3=3=66.6%
        //10/5=2=66.6%
        //10/7=1.428=66.7%


