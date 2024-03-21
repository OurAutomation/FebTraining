package org.files;

import java.io.File;

public class CheckFilePermissions {
    public static void main(String[] args) {
        String PROJECT_HOME = System.getProperty("user.dir");
        File file = new File(PROJECT_HOME + File.separator + "test.txt");
        System.out.println("Is Readable :: " + file.canRead());
        System.out.println("Is Writable :: " + file.canWrite());
        System.out.println("Is Executable :: " + file.canExecute());
        file = new File(PROJECT_HOME + File.separator + "test_1.txt");
        System.out.println("Is Readable :: " + file.canRead());
        System.out.println("Is Writable :: " + file.canWrite());
        System.out.println("Is Executable :: " + file.canExecute());
    }
}
