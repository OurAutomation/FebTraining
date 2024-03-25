package org.SravanAssignments;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadandWrite {
    public static void main(String[] args) throws IOException {
        String PROJECT_HOME = System.getProperty("user.dir");
        FileWriter fileWriter = new FileWriter(PROJECT_HOME + File.separator + "ABC.txt");
        FileReader fileReader2 = new FileReader(PROJECT_HOME + File.separator + "test.txt");
        int i=0;
        while ((i = fileReader2.read()) != -1) {
            fileWriter.write(i);
        }
        fileReader2.close();
        fileWriter.close();
        System.out.println("File copied successfully.");
    }
}


