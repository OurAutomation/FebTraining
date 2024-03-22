package org.SravanAssignments;

import java.io.File;
import java.io.IOException;

public class DeleteAllFiles {
    public static void main(String[] args) throws IOException {
        String PROJECT_HOME = System.getProperty("user.dir");
        File file = new File(PROJECT_HOME + File.separator + "FunFolder");
        file.delete();
        System.out.println(file.exists());


    }
}
