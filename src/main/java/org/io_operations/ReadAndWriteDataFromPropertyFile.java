package org.io_operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class ReadAndWriteDataFromPropertyFile {
    /*
     *
     * driver.sendKeys(username) driver.sendKeys(prop.getkey(username))
     * driver.sendKeys(password)*/
    public static void main(String[] args) throws IOException {
        //i am creating a file object for the file data.properties
        File propertyFile = new File( File.separator + "Data.properties");
        FileInputStream inStream = new FileInputStream(propertyFile);
        Properties properties = new Properties();
        properties.load(inStream);
        HashMap<String, String> keyAndValue = new HashMap<>();
        properties.stringPropertyNames().forEach(e -> {
            keyAndValue.put(e, (String) properties.get(e));
        });
        inStream.close();
        System.out.println(keyAndValue.get("firstname"));
        System.out.println(keyAndValue.get("number"));
        System.out.println(keyAndValue.get("address"));

        properties.setProperty("firstname", "12222");
        properties.setProperty("number", "122");
        properties.setProperty("address", "abcd1223");
        FileOutputStream fileOutputStream = new FileOutputStream(FileUtilsData.PROJECT_HOME + File.separator + "Data.properties");
        properties.store(fileOutputStream, "");
        fileOutputStream.close();
    }
}
