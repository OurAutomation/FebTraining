package org.files;

import java.io.File;
import java.io.IOException;

public class DirectoryOperations {
    public static void main(String[] args) throws IOException {
        String PROJECT_HOME = System.getProperty("user.dir");
        File file = new File(PROJECT_HOME + File.separator + "target");
//        file.isDirectory(); to check if the given file is a directory
        file = new File(PROJECT_HOME + File.separator + "FolderCreatedThroughJava"
                + File.separator + "Test" + File.separator + "ChildFolder");
        boolean mkdir = file.mkdirs();
        System.out.println("Is Directory Created :: " + mkdir);
        /*file.mkdir();
        System.out.println("Is Present :: " + file.exists());
        file.delete();// It will delete file or directory*/


    }
}
