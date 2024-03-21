package org.files;


import java.io.File;
import java.io.IOException;

public class FileInspection {
    public static void main(String[] args) throws IOException {
        String PROJECT_HOME = System.getProperty("user.dir");//Returns the absolute path of the project
//        System.out.println(PROJECT_HOME);
        File file = new File(PROJECT_HOME + File.separator + "test.txt");
        System.out.println(file.getAbsolutePath());// Will return the complete path of the file
        System.out.println("Is Directory :: " + file.isDirectory());
        System.out.println("Is File :: " + file.isFile());
        File targetFolderPath = new File(PROJECT_HOME + File.separator + "target");
        System.out.println("Is Directory :: " + targetFolderPath.isDirectory());
        System.out.println("Is File :: " + targetFolderPath.isFile());
        /*if (file.exists()) {
            System.out.println("File is present");
        } else {
            System.out.println("File is not present");
        }

        file = new File(PROJECT_HOME + File.separator + "test1.txt");
        if (file.exists()) {
            System.out.println("File is present");
        } else {
            System.out.println("File is not present");
        }*/
    }
}
