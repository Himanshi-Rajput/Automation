package test.testcase1;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

public class DataDrivenTesting {
    public static void main(String[] args) throws IOException {
        //FileInputStream
        //XSSFWorkbook
        //XSSFSheet
        //XSSFRow
        //XSSFCell

        //Methods:- ToString(), getStringCellValue() , getNumericCellValue() , getBooleanCellValue().....

        FileInputStream file = new FileInputStream("C://Users//HimanshiRajput//Desktop//Automationjava//Registration.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1"); //Accessing sheet with name.
        // XSSFSheet sheet = workbook.getSheetAt(0); -- Accessing sheet with index value.
        int RowCount = sheet.getLastRowNum(); ///Return the row count
        int  Column_count = sheet.getRow(0).getLastCellNum(); //Return Column count

        for (int i=0 ; i<RowCount ; i++)
        {
             XSSFRow Pointing_Row = sheet.getRow(i);
             for (int j =0; j< Column_count ; j++)
             {
                 String value = Pointing_Row.getCell(j).toString();
                 System.out.print(" "+ value);
             }
            System.out.println();
        }

    }
}
