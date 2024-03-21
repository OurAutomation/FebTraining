package org.files;

import java.io.File;
import java.io.IOException;

public class RenameAFile {
    public static void main(String[] args) throws IOException {
        String PROJECT_HOME = System.getProperty("user.dir");
        File src = new File(PROJECT_HOME + File.separator + "FileCreatedThroughJava.txt");
        boolean isFileCreated = src.createNewFile();
        File destination = new File(PROJECT_HOME + File.separator + "FileCreatedThroughJava_renamed.txt");
        boolean isRenamed = src.renameTo(destination);
        System.out.println("is Renamed :: " + isRenamed);

    }
}
