package org.whileLoop;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int j = 3;
        while (j > 0) { //0 times executed
            System.out.println("While Loop");
            j--;
        }
        j = 3;
        do {
            System.out.println("Do while loop");
            j--;
        } while (j > 0);
    }
}
