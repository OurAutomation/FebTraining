package org.exceptionHandling;

//Runtime exceptions
public class UncheckedExceptionsHandling {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(1 / 0);
            } catch (Exception e) {
               e.printStackTrace();
            }
            int[] iarr = {1, 2, 3, 4};
            System.out.println(iarr[5]);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Hello");
    }
}
