package org.SravanAssignments;

public class EvenOdd {
    public static void main(String[] args) {
        for(int num=0;num<=100;num++){
            if(num%2==0){
                System.out.println("Even Numbers :"+num);
            } else if (num%2!=0) {
                System.out.println("OddNumbers :"+num);
            }
        }
    }
}
