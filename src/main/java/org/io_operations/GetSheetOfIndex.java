package org.io_operations;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class GetSheetOfIndex {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("Details.xlsx")) {
            // Create a Workbook from the Excel file
            Workbook workbook = WorkbookFactory.create(file);

            // Get the first sheet (index 0) from the workbook
            Sheet sheet = workbook.getSheetAt(0);

            // Print out the sheet name
            System.out.println("Sheet Name: " + sheet.getSheetName());

            // Other operations on the sheet can be performed here

            // Close the workbook when done
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
