package org.SravanAssignments;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadandWrite {
    public static void main(String[] args) throws IOException {
        String PROJECT_HOME = System.getProperty("user.dir");
        /*FileReader fileReader = new FileReader(PROJECT_HOME + File.separator + "mine.txt");
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.println(i);
        }
        fileReader.close();*/
        //File file = new File("ABC.txt");
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


