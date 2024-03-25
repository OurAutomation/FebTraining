package org.io_operations;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelData {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("Details.xlsx")) {
            // Create a Workbook from the Excel file
            Workbook workbook = new XSSFWorkbook(file);

            // Create a StringBuilder to store all Excel data
            StringBuilder excelData = new StringBuilder();

            // Iterate over all sheets in the workbook
            for (Sheet sheet : workbook) {
                // Iterate over all rows in the sheet
                for (Row row : sheet) {
                    // Iterate over all cells in the row
                    for (Cell cell : row) {
                        // Append cell value to the StringBuilder
                        excelData.append(cell.toString()).append("\t");
                    }
                    // Add a newline character after each row
                    excelData.append("\n");
                }
            }

            // Print the complete Excel data
            System.out.println("Complete Excel Data:");
            System.out.println(excelData.toString());

            // Close the workbook
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
