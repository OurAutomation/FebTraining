package org.exceptions;

import java.io.File;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) throws IOException, InterruptedException, NotADirectoryException {
        String PROJECT_HOME = System.getProperty("user.dir");
        File file = new File(PROJECT_HOME + File.separator + "FileCreatedThroughJava.txt");
        boolean isFileCreated = file.createNewFile();
        Thread.sleep(1000);
        new FileUtils().listOnlyFilesFromTheGivenFolder("");
    }
}
