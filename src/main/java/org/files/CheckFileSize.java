package org.files;

import java.io.File;

public class CheckFileSize {
    public static void main(String[] args) {
        String PROJECT_HOME = System.getProperty("user.dir");
        File file = new File(PROJECT_HOME + File.separator + "test.txt");
        System.out.println("File Size is :: " + file.length());
        file = new File(PROJECT_HOME + File.separator + "test_1.txt");
        System.out.println("File Size is :: " + file.length());
    }
}
