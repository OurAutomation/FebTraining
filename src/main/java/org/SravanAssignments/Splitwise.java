package org.SravanAssignments;

public class Splitwise {
    public static void main(String[] args) {
        String[] names={"r","s","t","v"};
        int[] amount={10000,8000,6000,4000};
        int total = 0;
        for(int amt : amount){
            total += amt;
        }
        System.out.println(total);
        float avg = total/names.length;
        System.out.println(avg);
        for(int i=0; i<names.length;i++){
            float balance=amount[i]-avg;
            System.out.println(names[i]+" :"+balance);
        }
    }

}
