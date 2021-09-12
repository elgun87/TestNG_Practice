package ApachiPOI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Practice {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;
    FileInputStream filInput;
    FileOutputStream fileOutput;

    @Test
    public void get_data_from_excel() throws IOException {
        filInput = new FileInputStream("Vytracktestdata.xlsx");

        workbook = new XSSFWorkbook(filInput);

        sheet = workbook.getSheet("QA2-short");

        List<Map<String,Object>> list_excel = new ArrayList<>();

        for(int j = 1;j < sheet.getPhysicalNumberOfRows();j++){
            Map<String,Object> excelData = new LinkedHashMap<>();
            for(int k = 0;k < sheet.getRow(j).getPhysicalNumberOfCells();k++){
                excelData.put(sheet.getRow(0).getCell(k).getStringCellValue(),sheet.getRow(j).getCell(k).getStringCellValue());
                //replave Bella with Ali
                if(sheet.getRow(j).getCell(k).getStringCellValue().equals("Bella")){
                    sheet.getRow(j).getCell(k).setCellValue("Ali");
                }
            }
            list_excel.add(excelData);
        }

        list_excel.stream().filter(e -> e.get("firstname").equals("Bella")).forEach(s -> System.out.println(s.get("lastname")));

        fileOutput = new FileOutputStream("Vytracktestdata.xlsx");
        workbook.write(fileOutput);

        fileOutput.close();
        filInput.close();
        workbook.close();
    }
}
