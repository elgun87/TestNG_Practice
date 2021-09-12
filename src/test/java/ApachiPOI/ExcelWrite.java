package ApachiPOI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @Test
    public void excel_writing_test() throws IOException {
        String path = "C:\\Users\\elgun\\IdeaProjects\\Selenium_Rahul_TestNg\\Vytracktestdata.xlsx";
        FileInputStream fileInput = new FileInputStream(path);

        workbook = new XSSFWorkbook(fileInput);
        sheet = workbook.getSheet("QA1-short");

        //user1 row
        row = sheet.getRow(1);

        //user1 cell
        cell = row.getCell(0);

        XSSFCell user2_cell = sheet.getRow(2).getCell(2);
        System.out.println("before " + user2_cell);

        user2_cell.setCellValue("Mike");

        FileOutputStream fileOut = new FileOutputStream(path);

        workbook.write(fileOut);
        fileInput.close();
        fileOut.close();
        workbook.close();

    }
}
