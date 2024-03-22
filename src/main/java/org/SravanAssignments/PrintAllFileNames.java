package org.SravanAssignments;

import java.io.File;
import java.util.Arrays;

public class PrintAllFileNames {
    public static void main(String[] args) {
        String P= System.getProperty("user.dir");
        File file = new File(P + File.separator + ".idea");
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(e->{
            System.out.println(e.getName());
        });
        System.out.println();
    }

}
