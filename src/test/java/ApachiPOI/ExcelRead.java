package ApachiPOI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void read_from_excel_file() throws IOException {
        //todo  workbook > sheet > row > cell
        //Get the path
        String path = "C:\\Users\\elgun\\IdeaProjects\\Selenium_Rahul_TestNg\\Vytracktestdata.xlsx";
        FileInputStream fileInput = new FileInputStream(path);

        //1 - create object from class XSSFWorkbook and load file to constructor
        XSSFWorkbook workbook = new XSSFWorkbook(fileInput);

        //2 - get specific sheet by creating object

        XSSFSheet sheet = workbook.getSheet("QA3-short");

        //3- select row and cell
        System.out.println("sheet.getRow(1).getCell(0) = " + sheet.getRow(1).getCell(0));

        //get count of used rows
        int usedRows = sheet.getPhysicalNumberOfRows();

        //Returns the number of from top to the bottom cell
        //it does not care if there are empty cells or not
        int lastUsedRow = sheet.getLastRowNum();

        //Todo create a logic find Nona
        for (int rowNum = 0; rowNum < usedRows; rowNum++) {

            for(int cell = 0; cell < sheet.getRow(rowNum).getPhysicalNumberOfCells();cell ++){
              if(sheet.getRow(rowNum).getCell(cell).getStringCellValue().equals("Nona")){
                  for(int i = 0;i < sheet.getRow(rowNum).getPhysicalNumberOfCells();i++){
                      System.out.print(sheet.getRow(rowNum).getCell(i) + " ");
                  }
              }
            }
        }
        fileInput.close();
        workbook.close();
    }

}

/*ApachiPoi Api used to connect excel and java.
Poi-ooxml and poi dependency
Strategy to Access Excel Data:
Create object for XSSFWorkbook class – it has all method to pull the data from Excell
Get Access to Sheet
Get Access to all rows of Sheet
Access to specific row from all rows
Get Access to all cells of Row
Access the Data from Excel into Arrays

 */


