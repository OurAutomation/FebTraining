package org.SravanAssignments;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FirstRowAsKeyAndSecondRowAsValue {
    public static void main(String[] args) throws IOException {
        File file = new File("Details.xlsx");
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheetAt(0);
        Map<String, String> mapData = new HashMap<>();
        Row firstRowData = sheet.getRow(0);
        Row secondRowData = sheet.getRow(1);
        for (int i = 0; i < firstRowData.getLastCellNum(); i++) {
            Cell keyCell = firstRowData.getCell(i);
            Cell valueCell = secondRowData.getCell(i);
            if (keyCell != null && valueCell != null) {
//In general, the toString method returns a string that "textually represents" this object.
// The result should be a concise but informative representation that is easy for a person to read.
                String key = keyCell.toString();
                String value = valueCell.toString();
                mapData.put(key, value);
            }
        }
        for(Map.Entry<String, String> entry : mapData.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        workbook.close();
    }
}
