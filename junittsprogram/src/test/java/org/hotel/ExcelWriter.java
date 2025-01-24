package org.hotel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelWriter {

    public static void writeOrderIdToExcel(String filePath, String sheetName, int rowNumber, int cellNumber, String orderId) {
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet == null) {
                sheet = workbook.createSheet(sheetName);
            }

            Row row = sheet.getRow(rowNumber);
            if (row == null) {
                row = sheet.createRow(rowNumber);
            }

            Cell cell = row.createCell(cellNumber);
            cell.setCellValue(orderId);

            fis.close();

            FileOutputStream fos = new FileOutputStream(file);
            workbook.write(fos);
            ((FileInputStream) workbook).close();
            fos.close();

            System.out.println("Order ID written successfully to Excel file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
