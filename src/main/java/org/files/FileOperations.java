package org.files;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        String PROJECT_HOME = System.getProperty("user.dir");
        File file = new File(PROJECT_HOME + File.separator + "FileCreatedThroughJava.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("Is File Created :: " + isFileCreated);
        System.out.println("Is File Present :: " + file.exists());
        file.delete();
        /* File fileRenamed = new File(PROJECT_HOME + File.separator + "FileCreatedThroughJava_renamed.txt");
        fileRenamed.delete();*/
        System.out.println("Is File Present :: " + file.exists());
    }
}
