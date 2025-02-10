package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    private Workbook workbook;

    public ExcelReader(String filePath) {
        try {
            FileInputStream file = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getCellData(String sheetName, int row, int col) {
        Sheet sheet = workbook.getSheet(sheetName);
        if (sheet == null) return null;
        Row rowData = sheet.getRow(row);
        if (rowData == null) return null;
        Cell cell = rowData.getCell(col);
        if (cell == null) return null;
        return cell.toString();
    }

    public int getRowCount(String sheetName) {
        Sheet sheet = workbook.getSheet(sheetName);
        return (sheet == null) ? 0 : sheet.getLastRowNum();
    }
}
