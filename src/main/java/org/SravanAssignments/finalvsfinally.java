package org.SravanAssignments;

public class finalvsfinally {
    public static void main(String[] args) {
        final int x = 10;
        try {
            System.out.println("R");
        } finally {
            System.out.println("I didnot Understand");
        }
        System.out.println("Program completed");
    }
}
