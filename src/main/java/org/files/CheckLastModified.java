package org.files;

import java.io.File;
import java.util.Date;

public class CheckLastModified {
    public static void main(String[] args) {
        String PROJECT_HOME = System.getProperty("user.dir");
        File file = new File(PROJECT_HOME + File.separator + "target");
        System.out.println("last modified :: " + new Date(file.lastModified()));
    }
}
