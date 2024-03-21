package org.files;

import java.io.File;
import java.util.Arrays;

public class DisplayTheFilesInTheFolder {
    public static void main(String[] args) {
        String PROJECT_HOME = System.getProperty("user.dir");
        File file = new File(PROJECT_HOME + File.separator + "target");
        String[] list = file.list();
        System.out.println(Arrays.toString(list));
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(e->{
            System.out.println(e.getName());
        });
        System.out.println();
    }
}
