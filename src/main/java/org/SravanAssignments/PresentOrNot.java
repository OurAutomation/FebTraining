package org.SravanAssignments;

import java.io.File;
import java.io.IOException;

public class PresentOrNot {
    public static void main(String[] args) throws IOException {
        String PROJECT_HOME = System.getProperty("user.dir");
        File file = new File(PROJECT_HOME + File.separator + "testnew.txt");
        System.out.println(file);
        System.out.println("Is File Present :: " + file.exists());
        file.delete();
        boolean isFileCreated = file.createNewFile();
        System.out.println("Is File Created :: " + isFileCreated);

    }
}
