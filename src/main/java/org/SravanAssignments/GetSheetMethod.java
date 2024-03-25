package org.SravanAssignments;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class GetSheetMethod {
    public static void main(String[] args) throws IOException {
        File file = new File("Details.xlsx");
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheetAt(0);
        Sheet sheetName = workbook.getSheet("test");
        System.out.println("Sheet found: " + sheet);
        System.out.println("Sheet found: " + sheet.getSheetName());
        workbook.close();
    }
}
