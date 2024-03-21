package org.io_operations;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteDataInToTextFile {
   static String expectedParagraph="We know that you care how information about you is used and shared, and we appreciate your trust that we will do so carefully and sensibly. This Privacy Notice describes how Amazon Seller Services Private Limited and its affiliates including Amazon.com, Inc. (collectively \"Amazon\") collect and process your personal information through Amazon websites, devices, products, services, online marketplace and applications that reference this Privacy Notice (together \"Amazon Services\").\n" +
            "\n" +
            "By using Amazon Services you agree to our use of your personal information (including sensitive personal information) in accordance with this Privacy Notice, as may be amended from time to time by us at our discretion. You also agree and consent to us collecting, storing, processing, transferring, and sharing your personal information (including sensitive personal information) with third parties or service providers for the purposes set out in this Privacy Notice.\n" +
            "\n" +
            "Personal information subject to this Privacy Notice will be collected and retained by Amazon, with a registered office at 8th floor, Brigade Gateway 26/1 Dr. Rajkumar Road Bangalore Karnataka 560055 India.";
    public static void main(String[] args) throws IOException {
        FileUtilsData.createAFile("ABC.txt");
        FileWriter fileWriter = new FileWriter(FileUtilsData.PROJECT_HOME + File.separator + "ABC.txt");
        fileWriter.write(expectedParagraph);
        /*
        fileWriter.write("test adding data to text file line 2\n");
        fileWriter.write("test adding data to text file line 3\n");
        fileWriter.write("test adding data to text file line 4\n");*/
        fileWriter.close();
        FileReader fileReader = new FileReader(FileUtilsData.PROJECT_HOME + File.separator + "ABC.txt");
        int i;
        while ((i = fileReader.read()) != -1) {
//            System.out.println(i);
            System.out.print((char) i);
        }
    }
    //JSON File
}
