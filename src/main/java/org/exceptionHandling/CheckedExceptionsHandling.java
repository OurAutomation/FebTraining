package org.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionsHandling {
    public static void main(String[] args) {
        String PROJECT_HOME = System.getProperty("user.dir");
        File file = new File("ABC:" + File.separator + "FileCreatedThroughJava.txt");
       /* try {
            boolean isFileCreated = file.createNewFile();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("The filepath given is wrong");
        }*/
        /*try {
            boolean isFileCreated = file.createNewFile();
            Thread.sleep(1000);
        } catch (InterruptedException | IOException e) {
//            e.printStackTrace();
            System.err.println(e.getMessage());
        }*/
        try {
            boolean isFileCreated = file.createNewFile();
            Thread.sleep(1000);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("hello");
    }
}
