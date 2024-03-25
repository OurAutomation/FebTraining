package org.SravanAssignments;

import org.apache.poi.ss.usermodel.*;
/*The Apache POI library is a popular Java library used for
working with Microsoft Office documents such as Excel, Word, and PowerPoint.*/
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ExcelDataInSingleVariable {
    public static void main(String[] args) throws IOException {
        File file = new File("Details.xlsx");
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheetAt(0);
        List<List<Object>> excelData = new ArrayList<>();
        for (Row row : sheet) {
            List<Object> rowData = new ArrayList<>();
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            rowData.add(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            rowData.add(cell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            rowData.add(cell.getBooleanCellValue());
                            break;
                        default:
                            rowData.add(null);
                    }
                }
                excelData.add(rowData);
            }
        for(List<Object>rowData : excelData) {
            System.out.println(rowData);
        }
            workbook.close();
        }
}
